package Sorting;

import static Sorting.BubbleSort.swap;

public class InsertionSort {
    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j - 1, j);
                }
                else {
                    break;
                }
            }
        }
        return arr;
    }
}
