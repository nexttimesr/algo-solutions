package Arrays;
import java.util.*;

public class DutchNationalFlag {
    public static int[] dutchFlag(int[] arr) {
        int[] counts = new int[3];
        for (int i: arr) {
            if (i >= counts.length || i < 0) {
                return new int[0];
            }
            counts[i]++;
        }
        int cur = 0;
        for (int i = 0; i < arr.length; i++) {
            while (counts[cur] == 0) {
                cur++;
            }
            arr[i] = cur;
            counts[cur]--;
        }
        return arr;
    }
    public static int[] dutchFlagTwoPointer(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int cur = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 || arr[i] > 2) {
                return new int[0];
            }
            if (arr[i] == 0) {
                swap(arr, i, left++);
            }
            else if (arr[i] == 2) {
                swap(arr, i, right--);
            }
        }
        return arr;
//        while (left < right) {
//            if (arr[left] == 2) {
//                swap(arr, left++, right--);
//            }
//            else if (arr[right] == 0) {
//
//            }
//        }
//        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void test() {
        int[] test1 = new int[]{-1, 0, 0, 0, 0};
        int[] test2 = new int[]{0, 0, 0, 4};
        int[] test3 = new int[]{0, 0, 1, 2, 2};
        int[] test4 = new int[]{1, 2, 2, 1, 2, 0, 0, 0, 0, 0};
        int[] test5 = new int[]{0, 0, 2, 2, 2, 1};
        int[] test6 = new int[0];
        int[] test7 = new int[]{0};
        System.out.println(Arrays.toString(dutchFlag(test1)));
        System.out.println(Arrays.toString(dutchFlag(test2)));
        System.out.println(Arrays.toString(dutchFlag(test3)));
        System.out.println(Arrays.toString(dutchFlag(test4)));
        System.out.println(Arrays.toString(dutchFlag(test5)));
        System.out.println(Arrays.toString(dutchFlag(test6)));
        System.out.println(Arrays.toString(dutchFlag(test7)));
        System.out.println();
        System.out.println(Arrays.toString(dutchFlagTwoPointer(test1)));
        System.out.println(Arrays.toString(dutchFlagTwoPointer(test2)));
        System.out.println(Arrays.toString(dutchFlagTwoPointer(test3)));
        System.out.println(Arrays.toString(dutchFlagTwoPointer(test4)));
        System.out.println(Arrays.toString(dutchFlagTwoPointer(test5)));
        System.out.println(Arrays.toString(dutchFlagTwoPointer(test6)));
        System.out.println(Arrays.toString(dutchFlagTwoPointer(test7)));
        System.out.println();
    }
}
