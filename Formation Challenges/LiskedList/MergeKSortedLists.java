package LiskedList;

public class MergeKSortedLists {
    public static ListNode merge(ListNode[] lists) {
        int size = lists.length;
        while (size > 1) {
            for (int i = 0; i < size; i += 2) {
                if (i + 1 == size) {
                    lists[i / 2] = lists[i];
                }
                else {
                    lists[i / 2] = merge2(lists[i], lists[i + 1]);
                }
            }
            size = (size + 1) / 2;
        }
        return lists.length == 0 ? null : lists[0];
    }

    public static ListNode merge2(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                cur.next = list1;
                list1 = list1.next;
            }
            else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if (list1 == null) {
            cur.next = list2;
        }
        else {
            cur.next = list1;
        }
        return dummy.next;
    }

    public static void test() {
        ListNode LL9 = new ListNode(-1, new ListNode(4, new ListNode(5)));
        ListNode LL6 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(4))));
        ListNode LL7 = new ListNode(2, new ListNode(6));
        ListNode LL8 = new ListNode(1, new ListNode(11, new ListNode(111)));
        merge(new ListNode[]{LL9, LL6, LL7}).print();
        System.out.println();
        merge(new ListNode[]{LL8, new ListNode()}).print();
        System.out.println();
        merge(new ListNode[]{new ListNode()}).print();
        System.out.println();
        System.out.println();
    }
}
