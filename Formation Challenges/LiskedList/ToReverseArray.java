package LiskedList;

import java.util.*;

public class ToReverseArray {
    public static List<Integer> toReverseArray(ListNode head) {
        List<Integer> ret = new ArrayList<>();
        rec(ret, head);
        return ret;
    }
    public static void rec(List<Integer> ret, ListNode head) {
        if (head == null) {
            return;
        }
        rec(ret, head.next);
        ret.add(head.value);
    }

    public static void test() {
        ListNode test1 = null;
        ListNode test2 = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(2))));
        ListNode test3 = new ListNode(4, new ListNode(9, new ListNode(14)));
        ListNode test4 = new ListNode(5, new ListNode(10, new ListNode(15, new ListNode(20))));
        ListNode test5 = new ListNode(5);
        ListNode test6 = new ListNode(5, new ListNode(10));
        ListNode test7 = new ListNode(5, new ListNode(5, new ListNode(10, new ListNode(10))));
        ListNode test8 = new ListNode(5, new ListNode(5, new ListNode(5)));
        ListNode test9 = new ListNode(0);
        System.out.println(toReverseArray(test1).toString());
        System.out.println(toReverseArray(test2).toString());
        System.out.println(toReverseArray(test3).toString());
        System.out.println(toReverseArray(test4).toString());
        System.out.println(toReverseArray(test5).toString());
        System.out.println(toReverseArray(test6).toString());
        System.out.println(toReverseArray(test7).toString());
        System.out.println(toReverseArray(test8).toString());
        System.out.println(toReverseArray(test9).toString());
        System.out.println();
    }
}
