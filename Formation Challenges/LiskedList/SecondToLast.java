package LiskedList;

public class SecondToLast {
    public static int secondToLast(ListNode head) {
        if (head == null || head.next == null) {
            return -1;
        }
        while (head.next.next != null) {
            head = head.next;
        }
        return head.value;
    }

    public static void test() {
        ListNode test1 = new ListNode(1);
        ListNode test2 = new ListNode(1, new ListNode(2));
        ListNode test3 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode test4 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode (4))));
        ListNode test5 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(secondToLast(null));
        System.out.println(secondToLast(test1));
        System.out.println(secondToLast(test2));
        System.out.println(secondToLast(test3));
        System.out.println(secondToLast(test4));
        System.out.println(secondToLast(test5));
        System.out.println();
    }
}
