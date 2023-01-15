package Arrays;
import java.util.*;

public class KthSmallestInMSortedLists {
    public static int kthSmallestInMSortedLists(List<List<Integer>> lists, int k) {
        // min heap of size m: poll k times
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]); // [num, listIndex]
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).size() > 0) {
                minHeap.offer(new int[]{lists.get(i).get(0), i, 0});
            }
        }
        while (k > 1) {
            int[] cur = minHeap.poll();
            if (cur[2] + 1 < lists.get(cur[1]).size()) {
                minHeap.offer(new int[]{lists.get(cur[1]).get(cur[2] + 1), cur[1], cur[2] + 1});
            }
            k--;
        }
        return minHeap.poll()[0];
    }

    public static void test() {
        List<List<Integer>> lists1 = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(2, 6, 8)),
                new ArrayList<>(Arrays.asList(3, 6, 7)),
                new ArrayList<>(Arrays.asList(1, 3, 4))));
        System.out.println(kthSmallestInMSortedLists(lists1, 5));
        List<List<Integer>> lists2 = new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList()),
                new ArrayList<>(Arrays.asList(3, 6, 7)),
                new ArrayList<>(Arrays.asList(1))));
        System.out.println(kthSmallestInMSortedLists(lists2, 3));
        System.out.println();
    }
}
