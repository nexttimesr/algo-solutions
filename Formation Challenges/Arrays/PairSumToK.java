package Arrays;

public class PairSumToK {
    public static boolean pairSumToK(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean pairSumToKTwoPointer(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == k) {
                return true;
            }
            else if (sum < k) {
                left++;
            }
            else {
                right--;
            }
        }
        return false;
    }

    public static void test() {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int k1 = 5;
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        int k2 = 9;
        int[] arr3 = new int[]{1, 2};
        int k3 = 3;
        int[] arr4 = new int[]{1, 2};
        int k4 = 5;
        int[] arr5 = new int[]{1};
        int k5 = 1;
        int[] arr6 = new int[0];
        int k6 = 1;
        int[] arr7 = new int[]{1, 1, 1, 1, 1, 1};
        int k7 = 2;
        int[] arr8 = new int[]{1, 2, 3, 4, 5};
        int k8 = 15;
        System.out.println(pairSumToK(arr1, k1));
        System.out.println(pairSumToKTwoPointer(arr1, k1));
        System.out.println(pairSumToK(arr2, k2));
        System.out.println(pairSumToKTwoPointer(arr2, k2));
        System.out.println(pairSumToK(arr3, k3));
        System.out.println(pairSumToKTwoPointer(arr3, k3));
        System.out.println(pairSumToK(arr4, k4));
        System.out.println(pairSumToKTwoPointer(arr4, k4));
        System.out.println(pairSumToK(arr5, k5));
        System.out.println(pairSumToKTwoPointer(arr5, k5));
        System.out.println(pairSumToK(arr6, k6));
        System.out.println(pairSumToKTwoPointer(arr6, k6));
        System.out.println(pairSumToK(arr7, k7));
        System.out.println(pairSumToKTwoPointer(arr7, k7));
        System.out.println(pairSumToK(arr8, k8));
        System.out.println(pairSumToKTwoPointer(arr8, k8));
    }
}
