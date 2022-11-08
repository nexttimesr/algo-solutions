public class ArrayIteration {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printEveryOtherValue(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printEveryOtherValueSkipFirst(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printEveryKthValue(int[] arr, int k) {
        for (int i = 0; i < arr.length; i += k) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printReverseEveryOtherValue(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i -= 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printReverseEveryOtherValueSkipFirst(int[] arr) {
        for (int i = arr.length - 2; i >= 0; i -= 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printReverseEveryKthValue(int[] arr, int k) {
        for (int i = arr.length - 1; i >= 0; i -= k) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void test() {
        int[] arr1 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k1 = 4;
        int[] arr2 = new int[]{0, 1, 2, 3, 4, 5};
        int k2 = 3;
        int[] arr3 = new int[]{1, 2};
        int[] arr4 = new int[]{1};
        int[] arr5 = new int[0];
        System.out.println("Array 0 - 10, k = 4");
        print(arr1);
        printEveryOtherValue(arr1);
        printEveryOtherValueSkipFirst(arr1);
        printEveryKthValue(arr1, k1);
        printReverse(arr1);
        printReverseEveryOtherValue(arr1);
        printReverseEveryOtherValueSkipFirst(arr1);
        printReverseEveryKthValue(arr1, k1);
        System.out.println();
        System.out.println("Array 0 - 5, k = 3");
        print(arr2);
        printEveryOtherValue(arr2);
        printEveryOtherValueSkipFirst(arr2);
        printEveryKthValue(arr2, k2);
        printReverse(arr2);
        printReverseEveryOtherValue(arr2);
        printReverseEveryOtherValueSkipFirst(arr2);
        printReverseEveryKthValue(arr2, k2);
        System.out.println();
        System.out.println("Array 1 - 2, k = 3");
        print(arr3);
        printEveryOtherValue(arr3);
        printEveryOtherValueSkipFirst(arr3);
        printEveryKthValue(arr3, k2);
        printReverse(arr3);
        printReverseEveryOtherValue(arr3);
        printReverseEveryOtherValueSkipFirst(arr3);
        printReverseEveryKthValue(arr3, k2);
        System.out.println();
        System.out.println("Array 1, k = 3");
        print(arr4);
        printEveryOtherValue(arr4);
        printEveryOtherValueSkipFirst(arr4);
        printEveryKthValue(arr4, k2);
        printReverse(arr4);
        printReverseEveryOtherValue(arr4);
        printReverseEveryOtherValueSkipFirst(arr4);
        printReverseEveryKthValue(arr4, k2);
        System.out.println();
        System.out.println("Array Empty, k = 3");
        print(arr5);
        printEveryOtherValue(arr5);
        printEveryOtherValueSkipFirst(arr5);
        printEveryKthValue(arr5, k2);
        printReverse(arr5);
        printReverseEveryOtherValue(arr5);
        printReverseEveryOtherValueSkipFirst(arr5);
        printReverseEveryKthValue(arr5, k2);
        System.out.println();
    }
}
