package Arrays;
import java.util.*;

public class ZigZagConversion {
    public static int[] zigZagArray(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = sorted[left++];
            }
            else {
                arr[i] = sorted[right--];
            }
        }
        return arr;
    }
    public static void test() {
        int[] test1 = new int[]{1,5,6,7,4,9,123,12,2};
        int[] test2 = new int[]{1,5,6,7,4,9,12,2};
        int[] test3 = new int[]{1};
        int[] test4 = new int[0];
        int[] test5 = new int[]{4, 3, 7, 8, 6, 2, 1};
        System.out.println(Arrays.toString(zigZagArray(test1)));
        System.out.println(Arrays.toString(zigZagArray(test2)));
        System.out.println(Arrays.toString(zigZagArray(test3)));
        System.out.println(Arrays.toString(zigZagArray(test4)));
        System.out.println(Arrays.toString(zigZagArray(test5)));
        System.out.println();
    }
}
