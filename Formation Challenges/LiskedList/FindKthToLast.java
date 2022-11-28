package LiskedList;

public class FindKthToLast {
    public static int findKthToLast(ListNode head, int k) {
        ListNode slow = head;
        int i = 0;
        for (; i < k && head != null; i++) {
            head = head.next;
        }
        if (i < k) {
            return -1;
        }
        while (head != null) {
            head = head.next;
            slow = slow.next;
        }
        return slow.value;
    }

    public static void test() {
        ListNode LL1 = new ListNode(13, new ListNode(1, new ListNode(5, new ListNode(3, new ListNode(7, new ListNode(10))))));
        System.out.println(findKthToLast(LL1, 1)); // 10
        System.out.println(findKthToLast(LL1, 3)); // 3
        System.out.println(findKthToLast(LL1, 6)); // 13
        System.out.println(findKthToLast(LL1, 7)); // -1
        System.out.println();
    }
}
