package day05;
/*
最重要：树形结构递归套路：先假设可以从左孩子和右孩子中获取数据，
                        列出所有满足条件的情况，然后看要分别从左右孩子中获取怎样的数据在取并集
练习一：用递归和非递归两种方法实现二叉树的先序（头左右），中序（左头右），后序（左右头）遍历
        方法一:递归序的使用
        方法二：用栈实现
练习二：实现二叉树的宽度遍历（1,2,3,4,5,6,7），深度遍历就是先序遍历
        用队列（先进先出）实现
        扩展：求二叉树的最大宽度
练习三：判断一个二叉树是否是搜索二叉树(子树都满足左<头<右)
        方法：其实就是中序的顺序，只要把中序遍历中的打印改成比较就行了
练习四：判断一个数是不是完全二叉树
        方法：宽度遍历，分成两种false情况：一：只有右孩子没有左孩子
                                        二：结构不全的节点的接下来的节点不是叶节点
练习五:判断一个二叉树是不是平衡二叉树（子树的左右两边高度差不超过1）
练习六：判断一颗二叉树是不是满二叉树：
练习七：给定两个二叉树的节点，返回他们的最低公共祖先；
        方法一：哈希表
        方法二：最优化解
练习八：求一个节点的后序节点（中序的下一个节点）
        方法一：中序遍历，储存中序的顺序
        方法二：存在父指针（有右孩子就是右孩子的最左边的树，无右孩子就是当自己为左孩子时候的父节点）
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class binaryTree {
    public static void main(String[] args) {
        //构建二叉树
            Node head = new Node(1);
            Node node2 = new Node(2);
            Node node3 = new Node(3);
            Node node4 = new Node(4);
            Node node5 = new Node(5);
            Node node6 = new Node(6);
            Node node7 = new Node(7);
             Node node8 = new Node(8);
            Node node9 = new Node(9);
            head.left = node2;
            head.right = node3;
            node2.left = node4;
            node2.right = node5;
            node3.left = node6;
            node3.right = node7;
            node4.left=node8;
            node7.right=node9;

//        node4.left=node2;
//        node4.right=node6;
//        node2.left=head;
//        node2.right=node3;
//        node6.left=node5;
//        node6.right=node7;

//        head.left=node2;
//        head.right=node3;
//        node2.left=node4;
//        node4.left=node5;
//        node2.right=node6;

        preorderRecur(head);
        System.out.println("=======================");

        InorderRecur(head);
        System.out.println("=======================");

        postorderRecur(head);
        System.out.println("=======================");

        preorderStack(head);
        System.out.println("=======================");

        InorderStack(head);
        System.out.println("=======================");

        postorderStack(head);
        System.out.println("=======================");

        width(head);
        System.out.println("=======================");

        System.out.println(widthMax(head));
        System.out.println("=======================");

        System.out.println(isSBT(head));
        System.out.println(isCBT(head));
        System.out.println(isBBT(head));
        System.out.println(isFBT(head));
        System.out.println(LCA(head,node8,node9).data);
        System.out.println(LCA2(head,node8,node9).data);

    }
    //先序递归遍历
    public static void preorderRecur(Node head){
        if (head == null) {
            return;
        }
        System.out.print(head.data+" ");
        preorderRecur(head.left);
        preorderRecur(head.right);
    }
    //中序递归遍历
    public static void InorderRecur(Node head){
        if(head==null){
            return;
        }
        InorderRecur(head.left);
        System.out.print(head.data+" ");
        InorderRecur(head.right);
    }
    //后序递归遍历
    public static void postorderRecur(Node head){
        if(head==null){
            return;
        }
        postorderRecur(head.left);
        postorderRecur(head.right);
        System.out.print(head.data+" ");
    }
    //栈先序
    public static void preorderStack(Node head){
        Stack<Node> stack=new Stack<>();
        stack.push(head);
        while (!stack.empty()) {
            head=stack.pop();
                System.out.print(head.data + " ");
                if(head.right!=null) {
                    stack.push(head.right);
                }
                if(head.left!=null){
                    stack.push(head.left);
            }
        }
    }
    //栈中序
    public static void InorderStack(Node head){
        Stack<Node> stack=new Stack<>();
        while(!stack.empty()||head!=null){
            if(head!=null){
                stack.push(head);
                head=head.left;
            }else{
                head=stack.pop();
                System.out.print(head.data+" ");
                head=head.right;
            }
        }

    }
    //栈后序
    public static  void postorderStack(Node head){
        Stack<Node> stack1=new Stack<>();
        Stack<Node> stack2=new Stack<>();
        stack1.push(head);
        while(!stack1.empty()){
            head=stack1.pop();
            stack2.push(head);
            if (head.left!=null){
                stack1.push(head.left);
            }
            if(head.right!=null){
                stack1.push(head.right);
            }
        }
        while (!stack2.empty()){
            System.out.print(stack2.pop().data+" ");
        }

    }
    //宽度遍历
    public static void width(Node head){
        Queue<Node> queue=new LinkedList<>();
        queue.add(head);
        while(!queue.isEmpty()){
            head=queue.poll();
            System.out.print(head.data+" ");
            if(head.left!=null){
                queue.add(head.left);
            }
            if(head.right!=null){
                queue.add(head.right);
            }
        }
    }
    //求最大宽度
    public static int widthMax(Node head){
        Queue<Node> queue=new LinkedList<>();
        HashMap<Node,Integer> map=new HashMap<>();
        int curLevel=1;
        int curNode=0;
        int max=Integer.MIN_VALUE;
        map.put(head,curLevel);
        queue.add(head);
        while(!queue.isEmpty()){
            head=queue.poll();
            if(map.get(head)==curLevel){
                curNode++;
            }
            else{
                max=Math.max(max,curNode);
                curLevel++;
                curNode=1;
            }
            if(head.left!=null){
                map.put(head.left,curLevel+1);
                queue.add(head.left);
            }
            if(head.right!=null){
                map.put(head.right,curLevel+1);
                queue.add(head.right);
            }
        }
        return Math.max(max,curNode);
    }
    //判断是不是搜索二叉树
    public static int preData=Integer.MIN_VALUE;
    public static boolean isSBT(Node head){
            if(head==null){
                return true;
            }
            isSBT(head.left);
            if(head.data<=preData){
                return false;
            }else{
                preData=head.data;
            }
            isSBT(head.right);
            return true;
    }
    //判断二叉树是不是完全二叉树
    public static boolean isCBT(Node head){
        if (head == null) {
            return true;
        }
        Queue<Node> queue=new LinkedList<>();
        boolean leaf=false;
        queue.add(head);
        while(!queue.isEmpty()){
            head=queue.poll();
            if((head.left==null&&head.right!=null)
                         ||
            (leaf&&(head.left!=null||head.right!=null))){
                return false;
            }
            if(head.left!=null){
                queue.add(head.left);
            }
            if(head.right!=null){
                queue.add(head.right);
            }
            if(head.left==null||head.right==null){
                leaf=true;
            }
        }
        return true;
    }
    //判断是不是平衡二叉树
    public static boolean isBBT(Node head){
        return returnData(head).flag;
    }
    static class Data{
     public boolean flag;
     public int height;
     Data(boolean flag,int height){
         this.flag=flag;
         this.height=height;
     }
    }
    public static Data returnData(Node head){
        if(head==null){
            return new Data(true,0);
        }
        Data LData=returnData(head.left);
        Data RData=returnData(head.right);
        int height=Math.max(LData.height, RData.height)+1;
        boolean flag=(LData.flag&&RData.flag&&Math.abs(LData.height-RData.height)<2);
        return new Data(flag,height);

    }
    //判断是不是满二叉树
    public static boolean isFBT(Node head){
        info info=returnInfo(head);
        return info.nodes==Math.pow(2,info.height)-1;
    }
    static class info{
        int height;
        int nodes;
        public info(int height,int nodes) {
            this.height=height;
            this.nodes=nodes;
        }
    }
    public static  info returnInfo(Node head){
        if (head == null) {
            return new info(0,0);
        }
        info infoL=returnInfo(head.left);
        info infoR=returnInfo(head.right);
        int height=Math.max(infoL.height,infoR.height)+1;
        int nodes=infoL.nodes+infoR.nodes+1;
        return new info(height,nodes);
    }
    //求最低公共祖先
    public static Node LCA(Node head,Node node1,Node node2){
        HashMap<Node,Node> fatherMap=new HashMap<>();
        process(head,fatherMap);
        fatherMap.put(head,head);
        LinkedList<Node> nodes1=new LinkedList<>();
        while(node1!=head){
            nodes1.add(node1);
            node1=fatherMap.get(node1);
        }
        nodes1.add(head);
        while(node2!=head){
           if(nodes1.contains(node2)){
               return node2;
           }
           node2=fatherMap.get(node2);
        }

        return head;
    }
    public  static void process(Node head,HashMap map){
        if (head == null) {
            return;
        }
        map.put(head.left,head);
        process(head.left,map);
        map.put(head.right,head);
        process(head.right,map);

    }
    //求最低公共祖先最优解
    public static Node LCA2(Node head,Node node1,Node node2){
        if(head==null||head==node1||head==node2){
            return head;
        }
        Node left=LCA(head.left,node1,node2);
        Node right=LCA(head.right,node1,node2);
        if(left!=null&&right!=null){
            return head;
        }
        return left==null?right:left;
    }


}
