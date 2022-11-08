public class PrintAllPairs {
    public static void printAllPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
        System.out.println();
    }

    public static void test() {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        int[] arr3 = new int[]{1};
        int[] arr4 = new int[0];
        int[] arr5 = new int[]{1, 2, 1, 2};
        System.out.println("Pairs 1 - 3");
        printAllPairs(arr1);
        System.out.println("Pairs 1 - 5");
        printAllPairs(arr2);
        System.out.println("Pairs 1");
        printAllPairs(arr3);
        System.out.println("Pairs Empty");
        printAllPairs(arr4);
        System.out.println("Pairs 1 2 1 2");
        printAllPairs(arr5);
    }
}
