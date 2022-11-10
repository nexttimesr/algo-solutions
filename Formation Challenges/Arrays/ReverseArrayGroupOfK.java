package Arrays;

import java.util.Arrays;

public class ReverseArrayGroupOfK {
    public static int[] reverseK(int[] arr, int k) {
        int left = 0;
        int right = Math.min(k - 1, arr.length - 1);
        while (right < arr.length) {
            reverse(arr, left, right);
            if (right == arr.length - 1) {
                break;
            }
            left = right + 1;
            right = Math.min(left + k - 1, arr.length - 1);
        }
        return arr;
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left++, right--);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void test() {
        int[] test1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k1 = 3;
        int[] test2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k2 = 4;
        int[] test3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int k3 = 4;
        int[] test4 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int k4 = 8;
        int[] test5 = new int[]{1, 2, 3, 4};
        int k5 = 7;
        int[] test6 = new int[]{1};
        int k6 = 5;
        int[] test7 = new int[0];
        int k7 = 5;
        System.out.println(Arrays.toString(reverseK(test1, k1)));
        System.out.println(Arrays.toString(reverseK(test2, k2)));
        System.out.println(Arrays.toString(reverseK(test3, k3)));
        System.out.println(Arrays.toString(reverseK(test4, k4)));
        System.out.println(Arrays.toString(reverseK(test5, k5)));
        System.out.println(Arrays.toString(reverseK(test6, k6)));
        System.out.println(Arrays.toString(reverseK(test7, k7)));
        System.out.println();
    }
}
