package day05;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack stack=new Stack();
        System.out.println(stack.push(null));
        System.out.println(stack.push(2));
        System.out.println(stack.push(null));

        System.out.println(stack.search(2));
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());

    }
}
