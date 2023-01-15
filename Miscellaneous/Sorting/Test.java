package Sorting;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 515, 13, 2, -515, 355, 335, 22, 3, 5, 552, 2, 45, 6, 47, 475, 7, 47, 457, 7, 4, 74, 7457, 2, 52, 25, 253};
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int[] sortedDesc = new int[sorted.length];
        for (int i = sorted.length - 1; i >= 0; i--) {
            sortedDesc[sorted.length - i - 1] = sorted[i];
        }
        System.out.println("Bubble Sort");
        System.out.println(Arrays.toString(BubbleSort.sort(arr.clone())));
        System.out.println(Arrays.toString(BubbleSort.sort(sorted.clone())));
        System.out.println(Arrays.toString(BubbleSort.sort(sortedDesc.clone())));
        System.out.println();
        System.out.println("Selection Sort");
        System.out.println(Arrays.toString(SelectionSort.sort(arr.clone())));
        System.out.println(Arrays.toString(SelectionSort.sort(sorted.clone())));
        System.out.println(Arrays.toString(SelectionSort.sort(sortedDesc.clone())));
        System.out.println();
        System.out.println("Insertion Sort");
        System.out.println(Arrays.toString(InsertionSort.sort(arr.clone())));
        System.out.println(Arrays.toString(InsertionSort.sort(sorted.clone())));
        System.out.println(Arrays.toString(InsertionSort.sort(sortedDesc.clone())));
        System.out.println();
        System.out.println("Merge Sort");
        System.out.println(Arrays.toString(MergeSort.sort(arr.clone())));
        System.out.println(Arrays.toString(MergeSort.sort(sorted.clone())));
        System.out.println(Arrays.toString(MergeSort.sort(sortedDesc.clone())));
        System.out.println();

    }
}
