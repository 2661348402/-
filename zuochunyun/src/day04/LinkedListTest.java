package day04;

/*
练习一：打印两个有序链表的公共部分
练习二：判断一个链表是否为回文结构
       笔试：将数据放入一个栈中，然后依次弹出比对（就相当于得到一个逆序，然后比对）
       面试:用快慢指针
练习三：将单向链表按某值划按分左边小，中间相等，右边大的形式（不要求内部有序）
        方法一：将节点放入数组中然后partition分区
        方法二：用六个变量
练习四：复制含随机指针的单链表
        方法一：使用哈希表（额外空间复杂度o(n)）
        方法二：（额外空间复杂度为o(1)）
练习五：给定两个可能有环也可能无环的链表，头指针分别为head1和head2，
        如果两链表相交，返回第一个相交的节点，不相交返回null
        a:首先要判断链表是否有环，并返回第一个入环节点（）
        b:判断有无环的第一种方法：HashSet
        c:方法二：快慢指针
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l1.addNode(10);
        l1.addNode(30);
        l1.addNode(50);
        l1.addNode(70);
        l2.addNode(10);
        l2.addNode(20);
        l2.addNode(30);
        l2.addNode(40);
        l2.addNode(50);
        test(l1, l2);
        System.out.println("=================================");
        LinkedList list = new LinkedList();
        list.addNode(4);
        list.addNode(8);
        list.addNode(1);
        list.addNode(2);
        list.addNode(6);
        list.addNode(5);
        list.addNode(5);
        list.addNode(7);

//        list.printList();
//        System.out.println(test2(list));
//        list.printList();
        System.out.println("===============================");
        test3(list, 5);
        list.printList();
    }

    //练习一
    public static void test(LinkedList l1, LinkedList l2) {
        int i = 1, j = 1;
        while (i <= l1.length() && j <= l2.length()) {
            if (l1.dataAt(i) < l2.dataAt(j)) {
                i++;
            } else if (l1.dataAt(i) > l2.dataAt(j)) {
                j++;
            } else {
                System.out.println(l1.dataAt(i));
                i++;
                j++;
            }
        }
    }

    //练习二：快慢指针（使用有限的几个变量）
    public static boolean test2(LinkedList list) {
        boolean flag = true;
        if (list.head == null) {
            return flag;
        }
        LinkedList.Node n1 = list.head;
        LinkedList.Node n2 = list.head;
        while (n2 != null && n2.next != null) {
            n1 = n1.next;
            n2 = n2.next.next;
        }
        n2 = n1.next;
        n1.next = n1;
        LinkedList.Node n3 = n2.next;
        while (n3 != null) {
            n2.next = n1;
            n1 = n2;
            n2 = n3;
            n3 = n3.next;
        }
        n2.next = n1;
        LinkedList.Node temp = n2;
        n1 = list.head;
        while (n1 != n2) {
            if (n1.data != n2.data) {
                flag = false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        n2 = temp;
        temp = n1;
        n1 = null;
        n3 = n2.next;
        while (n2 != temp) {
            n2.next = n1;
            n1 = n2;
            n2 = n3;
            n3 = n3.next;
        }
        n2.next = n1;
        return flag;

    }

    //练习三：六个变量
    public static void test3(LinkedList list, int pivot) {
        LinkedList.Node head = list.head;
        if (head == null) {
            return;
        }
        LinkedList.Node sH = null;
        LinkedList.Node sT = null;
        LinkedList.Node mH = null;
        LinkedList.Node mT = null;
        LinkedList.Node bH = null;
        LinkedList.Node bT = null;
        LinkedList.Node next = null;
        while (head != null) {
            next = head.next;
            head.next = null;
            if (head.data < pivot) {
                if (sH == null) {
                    sH = head;
                    sT = head;
                } else {
                    sT.next = head;
                    sT = head;
                }
            } else if (head.data == pivot) {
                if (mH == null) {
                    mH = head;
                    mT = head;
                } else {
                    mT.next = head;
                    mT = head;
                }
            } else {
                if (bH == null) {
                    bH = head;
                    bT = head;
                } else {
                    bT.next = head;
                    bT = head;
                }
            }
            head = next;
        }
        if (sH != null) {
            sT.next = mH;
            mT = mT == null ? sT : mT;
        }
        if (mT != null) {
            mT.next = bH;
        }
    }
}
    //练习四：哈希表
