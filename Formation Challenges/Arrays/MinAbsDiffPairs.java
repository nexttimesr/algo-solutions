package Arrays;

import java.util.*;

public class MinAbsDiffPairs {
    public static List<int[]> minAbsDiffPairs(int[] arr) {
        List<int[]> ret = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int absDiff = Math.abs(arr[i] - arr[i + 1]);
            if (absDiff == min) {
                ret.add(new int[]{arr[i], arr[i + 1]});
            }
            else if (absDiff < min) {
                ret = new ArrayList<>();
                ret.add(new int[]{arr[i], arr[i + 1]});
                min = absDiff;
            }
        }
        return ret;
    }

    public static void test() {
        int[] test1 = new int[]{4, 2};
        int[] test2 = new int[]{10, 2, 6, 3, 5, 1, 9};
        int[] test3 = new int[]{10, 2, 6, 8, 4, 1, 15};
        int[] test4 = new int[]{10, 11, 6, 8, 4, 1, 15};
        int[] test5 = new int[]{3 ,8 ,-10 ,23 ,19 ,-4, -14, 27};
        printList(minAbsDiffPairs(test1));
        printList(minAbsDiffPairs(test2));
        printList(minAbsDiffPairs(test3));
        printList(minAbsDiffPairs(test4));
        printList(minAbsDiffPairs(test5));

    }
    public static void printList(List<int[]> list) {
        for (int[] arr: list) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
    }
}
