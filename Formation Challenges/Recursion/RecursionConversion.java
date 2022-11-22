package Recursion;

public class RecursionConversion {
    public static int recursiveFactorial(int x) {
        if (x <= 1) return 1;
        else return x * recursiveFactorial(x - 1);
    }

    public static int iterativeFactorial(int x) {
        // TODO: implement
        if (x == 0) {
            return 1;
        }
        if (x < 0) {
            return 0;
        }
        int ret = 1;
        for (int i = x; i > 0; i--) {
            ret *= i;
        }
        return ret;
    }

    public static int iterativeMax(int[] arr) {
        int result = arr.length > 0 ? arr[0] : null;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > result) result = arr[i];
        }

        return result;
    }

    public static int recursiveMax(int[] arr) {
        // TODO: implement
        if (arr.length == 0) {
            return -1;
        }
        return rec(arr, Integer.MIN_VALUE, 0);
    }
    // curMax is an argument that defaults to null if not specified when calling recursiveMax()
    // i is an argument that defaults to 0 if not specified when calling recursiveMax()
    public static int rec(int[] arr, int curMax, int i) {
        if (i == arr.length) {
            return curMax;
        }
        return rec(arr, Math.max(curMax, arr[i]), i + 1);
    }

    public static void test() {
        int[] test1 = new int[]{12, 312, 14, 12, 3, 3};
        int[] test2 = new int[0];
        int[] test3 = new int[]{-898};
        int[] test4 = new int[]{12313, 123, 21, 22};
        int[] test5 = new int[]{123, 1, 24, 223, 12455};
        System.out.println(iterativeFactorial(5));
        System.out.println(iterativeFactorial(1));
        System.out.println(iterativeFactorial(10));
        System.out.println(iterativeFactorial(0));
        System.out.println();
        System.out.println(recursiveMax(test1));
        System.out.println(recursiveMax(test2));
        System.out.println(recursiveMax(test3));
        System.out.println(recursiveMax(test4));
        System.out.println(recursiveMax(test5));
        System.out.println();
    }
}
