package day05;

import java.util.Stack;

//栈的使用
public class StackTest {
    public static void main(String[] args) {
        //创建一个栈;
        Stack stack=new Stack();
        //将元素压入栈中
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        //返回对象在栈中的位置，以1为基底
        System.out.println(stack.search(3));
        System.out.println(stack.search(5));
        //查看顶部元素但不移除
        System.out.println(stack.peek());
        //查看顶部元素并移除
        /*
        stack.isEmpty()和stack.empty的区别：empty()是stack的方法，而isEmpty()是继承父类vector的方法
         */
       while (!stack.empty()){
           System.out.print(stack.pop()+" ");
       };
    }

}
