package day04;

//单链表的实现
public class LinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        list.addNode(50);

        System.out.println(list.length());
        list.printList();

        //查找数据
        System.out.println(list.dataAt(1));
        System.out.println(list.dataAt(2));
        System.out.println(list.dataAt(5));
        //反转链表
        list.reverse();
        list.printList();
        //排序
        list.sort();
        list.printList();
        //根据数据删除
        list.deleteNodeByData(20);
        System.out.println(list.length());
        list.printList();
        //根据索引删除
        list.deleteNodeByIndex(1);
        System.out.println(list.length());
        list.printList();
        //添加链表
        list.addNode(100);
        System.out.println(list.length());
        list.printList();

    }



    Node head=null;
    static class Node{
        public int data;
        public Node next;
        public Node random;
        public Node(int data){
            this.data=data;
        }
        public Node(){}
    }
    //添加节点
    public void  addNode(int data){
        Node temp=head;
        if(head==null){
            head=new Node(data);
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(data);
    }
    //根据节点位置，删除节点
    public boolean deleteNodeByIndex(int index){
        if(index<1||index>length()){
            System.out.println("删除位置错误");
            return false;
        }
        if(index==1){
            head=head.next;
            return true;
        }
        int i=1;
        Node temp=head;
        while(temp.next!=null){
            if(index==i+1){
                temp.next=temp.next.next;
                return true;
            }
            i++;
            temp=temp.next;
        }
        return false;
    }
    //根据节点的数据，删除节点
    public boolean deleteNodeByData(int data){
        if(head==null){
            return false;
        }
        if(head.data==data){
            head=head.next;
            return true;
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.data==data){
                temp.next=temp.next.next;
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    //获取长度
    public int length(){
        if(head==null){
            return 0;
        }
        Node temp=head;
        int length=1;
        while(temp.next!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }
    //打印链表
    public void printList(){
        Node temp=head;
        while(head==null){
            System.out.println("链表为空");
            return;
        }
        System.out.print(temp.data);
        while(temp.next!=null){
            System.out.print("->"+temp.next.data);
            temp=temp.next;
        }
        System.out.println();
    }
    //反转链表
    public void reverse(){
        if (head == null) {
            return;
        }
        Node prev=null;
        Node temp=head;
        Node next=temp.next;
        while(next!=null){
           temp.next=prev;
           prev=temp;
           temp=next;
           next=next.next;
        }
        temp.next=prev;
        head=temp;
    }
    //链表排序
    public void sort(){
        if(head==null){
            return;
        }
        Node temp= head;
        while(temp.next!=null) {
            Node node=temp.next;
            while (node!= null) {
                if (temp.data > node.data) {
                    int num=temp.data;
                    temp.data= node.data;
                    node.data=num;
                }
                node=node.next;
            }
            temp=temp.next;
        }
        }
        //根据索引查找数据
    public int dataAt(int index){
        if(head==null){
            return -1;
        }
        Node node=head;
        int i=1;
        while (node!=null){
            if(i++==index){
                return node.data;
            }
            node=node.next;
        }
        return -1;
    }
    }

