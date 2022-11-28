package LiskedList;

public class FindMax {
    public static int max(ListNode head) {
        if (head == null) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        while (head != null) {
            max = Math.max(head.value, max);
            head = head.next;
        }
        return max;
    }

    public static void test() {
        ListNode LL1 = new ListNode(1, new ListNode(4, new ListNode(5, new ListNode(1))));

        ListNode LL2 = new ListNode(7, new ListNode(1, new ListNode(5, new ListNode(1))));

        ListNode LL3 = new ListNode(-1, new ListNode(-3, new ListNode(-5, new ListNode(0, new ListNode(-11)))));

        ListNode LL4 = new ListNode(1);
        System.out.println(max(LL1));
        System.out.println(max(LL2));
        System.out.println(max(LL3));
        System.out.println(max(LL4));
        System.out.println();
    }
}
