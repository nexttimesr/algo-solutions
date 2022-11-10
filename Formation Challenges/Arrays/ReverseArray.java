package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            swap(arr, left++, right--);
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void test() {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arr3 = new int[0];
        int[] arr4 = new int[]{1, 2};
        int[] arr5 = new int[]{1};
        System.out.println(Arrays.toString(reverseArray(arr1)));
        System.out.println(Arrays.toString(reverseArray(arr2)));
        System.out.println(Arrays.toString(reverseArray(arr3)));
        System.out.println(Arrays.toString(reverseArray(arr4)));
        System.out.println(Arrays.toString(reverseArray(arr5)));
    }
}
