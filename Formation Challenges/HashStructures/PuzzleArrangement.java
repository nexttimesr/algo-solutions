package HashStructures;
import java.util.*;

public class PuzzleArrangement {
    public static int puzzleArrangements(int[] arr, int target) {
        int ret = 0;
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (set.contains(sum - target)) {
                ret++;
            }
            set.add(sum);
        }
        return ret;
    }

    public static void test() {
        int[] test1 = new int[]{5, 3, 1, 4};
        int t1 = 8;
        int[] test2 = new int[0];
        int t2 = 0;
        int[] test3 = new int[]{1, 1, 1, 1, 1};
        int t3 = 2;
        int[] test4 = new int[]{5, 1, 3, 2, 4};
        int t4 = 8;
        int[] test5 = new int[]{5, 1, 9, 2, 4};
        int t5 = 6;
        int[] test6 = new int[]{5, 1, 3, 2, 4};
        int t6 = 15;
        int[] test7 = new int[]{1, 1, 1, 1, 1};
        int t7 = 6;
        int[] test8 = new int[]{1, 1, 1, 1, 1};
        int t8 = 1;
        System.out.println(puzzleArrangements(test1, t1));
        System.out.println(puzzleArrangements(test2, t2));
        System.out.println(puzzleArrangements(test3, t3));
        System.out.println(puzzleArrangements(test4, t4));
        System.out.println(puzzleArrangements(test5, t5));
        System.out.println(puzzleArrangements(test6, t6));
        System.out.println(puzzleArrangements(test7, t7));
        System.out.println(puzzleArrangements(test8, t8));
        System.out.println();
    }
}
