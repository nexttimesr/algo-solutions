package Sorting;

public class MergeSort {
    public static int[] sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    public static void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] l = new int[mid - left + 1];
        int[] r = new int[right - mid];
        for (int i = 0; i < mid - left + 1; i++) {
            l[i] = arr[left + i];
        }
        for (int i = 0; i < right - mid; i++) {
            r[i] = arr[mid + 1 + i];
        }
        int lp = 0;
        int rp = 0;
        for (int i = left; i <= right; i++) {
            if (lp == l.length) {
                arr[i] = r[rp++];
            }
            else if (rp == r.length) {
                arr[i] = l[lp++];
            }
            else if (l[lp] < r[rp]) {
                arr[i] = l[lp++];
            }
            else {
                arr[i] = r[rp++];
            }
        }
    }
}
