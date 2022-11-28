package Sorting;

public class BubbleSort {
    public static int[] sort(int[] arr) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    flag = true;
                    swap(arr, i, i + 1);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }
}
