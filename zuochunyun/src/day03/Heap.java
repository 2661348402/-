package day03;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
堆：用数组实现的完全二叉树结构
大根堆：每颗子树的最大值都在顶部的堆
小根堆：每颗子树的最小值在顶部的堆（java中的优先级队列默认就是小根堆：）
左孩子是2*i+1,右孩子是2*i+2,父是（i—1）/2;
 */
public class Heap {
    public static void main(String[] args) {
        //优先级队列：默认给出的小根堆
        PriorityQueue pq=new PriorityQueue();
        //常用的操作
        /*
        add()和offer()
        add(E e)和offer(E e)的语义相同，都是向优先队列中插入元素，
        只是Queue接口规定二者对插入失败时的处理不同，前者在插入失败时抛出异常，后则则会返回false。
        对于PriorityQueue这两个方法其实没什么差别。
         */
        pq.add(6);
        pq.add(2);
        pq.offer(5);
        pq.offer(7);
        pq.offer(8);
        System.out.println(pq.size());
        System.out.println(Arrays.toString(pq.toArray()));
        /*
        element()和peek()
        element()和peek()的语义完全相同，
        都是获取但不删除队首元素，也就是队列中权值最小的那个元素，
        二者唯一的区别是当方法失败时前者抛出异常，后者返回null。
        根据小顶堆的性质，堆顶那个元素就是全局最小的那个；
        由于堆用数组表示，根据下标关系，0下标处的那个元素既是堆顶元素。
        所以直接返回数组0下标处的那个元素即可。
         */
        System.out.println(pq.peek());
        System.out.println(pq.element());
        /*
        remove()和poll()
        remove()和poll()方法的语义也完全相同，都是获取并删除队首元素,
        区别是当方法失败时前者抛出异常，后者返回null。
        由于删除操作会改变队列的结构，为维护小顶堆的性质，需要进行必要的调整。
         */
        System.out.println(pq.poll());
        System.out.println(pq.remove());
        System.out.println(Arrays.toString(pq.toArray()));
        /*
        remove(Object o)
        remove(Object o)方法用于删除队列中跟o相等的某一个元素（如果有多个相等，只删除一个），
        该方法不是Queue接口内的方法，而是Collection接口的方法。
        由于删除操作会改变队列结构，所以要进行调整；
        又由于删除元素的位置可能是任意的，所以调整过程比其它函数稍加繁琐。
        具体来说，remove(Object o)可以分为2种情况：
        1. 删除的是最后一个元素.直接删除即可，不需要调整。
        2. 删除的不是最后一个元素，从删除点开始以最后一个元素为参照调用一次siftDown()即可。此处不再赘述
        */
        System.out.println(pq.remove(7));
        System.out.println(Arrays.toString(pq.toArray()));

    }
}
