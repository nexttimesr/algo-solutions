package Recursion;

import LiskedList.ListNode;

public class AppendToLinkedList {
    public static ListNode append(ListNode head, int value) {
        if (head == null) {
            return new ListNode(value);
        }
        if (head.next == null) {
            head.next = new ListNode(value);
            return head;
        }
        head.next = append(head.next, value);
        return head;
    }

    public static void test() {
        ListNode test1 = new ListNode(0, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode test2 = new ListNode(0, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode test3 = new ListNode(0);
        ListNode test4 = null;
        append(test1, 100).print();
        System.out.println();
        append(test2, 100).print();
        System.out.println();
        append(test3, 100).print();
        System.out.println();
        append(test4, 100).print();
        System.out.println();
        System.out.println();
    }
}
