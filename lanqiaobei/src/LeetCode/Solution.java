package LeetCode;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res=new ArrayList<>();
        Stack<Node> stack1=new Stack<>();
        Stack<Node> stack2=new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
           Node node= stack1.pop();
            stack2.push(node);
           List<Node> list=node.children;
            for (Node node1 : list) {
                stack1.push(node1);
            }
        }
        while(!stack2.isEmpty()){
            res.add(stack2.pop().val);
        }
        return res;
    }

    }
