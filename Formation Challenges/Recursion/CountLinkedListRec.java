package Recursion;

import LiskedList.ListNode;

import java.util.List;

public class CountLinkedListRec {
    public static int countLinkedListRec(ListNode head) {
        if (head == null) {
            return 0;
        }
        return 1 + countLinkedListRec(head.next);
    }
    public static void test() {
        ListNode test1 = new ListNode(0, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode test2 = new ListNode(0, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode test3 = new ListNode(0);
        ListNode test4 = null;
        System.out.println(countLinkedListRec(test1));
        System.out.println(countLinkedListRec(test2));
        System.out.println(countLinkedListRec(test3));
        System.out.println(countLinkedListRec(test4));
        System.out.println();
    }
}
