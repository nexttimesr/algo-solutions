package Arrays;

public class ShiftedBinarySearch {
    public static int sbs(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if ((arr[left] <= target && target <= arr[mid]) || (target <= arr[mid] && arr[mid] <= arr[left])) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void test() {
        System.out.println(sbs(new int[]{43, 51, 73, 78, 79, 0, 1, 3, 13, 35}, 13));
        System.out.println(sbs(new int[]{7, 26, 110, 2}, 110));
        System.out.println(sbs(new int[]{45, 60, 69, 74, 75, 0, 1, 3, 33, 39}, 0));
        System.out.println(sbs(new int[]{30, 37, 44, 67, 68, 75, 77, 268, 0, 1, 19}, 269));
        System.out.println(sbs(new int[]{30, 37, 44, 67, 68, 75, 77, 268, 0, 1, 19}, 30));
        System.out.println();
    }
}
