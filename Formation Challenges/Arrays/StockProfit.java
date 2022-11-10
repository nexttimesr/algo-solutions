package Arrays;

public class StockProfit {
    public static int maxProfitPotential(int[] arr) {
        int max = 0;
        int buy = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0 || arr[i] < buy) {
                buy = arr[i];
            }
            max = Math.max(arr[i + 1] - buy, max);
        }
        return max;
    }

    public static void test() {
        int[] test1 = new int[0];
        int[] test2 = new int[]{1};
        int[] test3 = new int[]{1, 6};
        int[] test4 = new int[]{6, 1};
        int[] test5 = new int[]{9, 5, 3, 2, 1};
        int[] test6 = new int[]{1, 4, 5, 9, 12, 13, 15};
        int[] test7 = new int[]{5, 5, 5, 5, 5, 5};
        int[] test8 = new int[]{8, 7, 1, 5, 9, 6, 4};
        System.out.println(maxProfitPotential(test1));
        System.out.println(maxProfitPotential(test2));
        System.out.println(maxProfitPotential(test3));
        System.out.println(maxProfitPotential(test4));
        System.out.println(maxProfitPotential(test5));
        System.out.println(maxProfitPotential(test6));
        System.out.println(maxProfitPotential(test7));
        System.out.println(maxProfitPotential(test8));
        System.out.println();
    }
}
