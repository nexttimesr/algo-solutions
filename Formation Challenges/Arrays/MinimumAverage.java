package Arrays;

public class MinimumAverage {
    public static int averageColumnMinimum(int[][] matrix) {
        if (matrix.length == 0) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            min = Math.min(sum / matrix.length, min);
        }
        return min;
    }
    public static int averageRowMinimum(int[][] matrix) {
        if (matrix.length == 0) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
            min = Math.min(sum / matrix[0].length, min);
        }
        return min;
    }

    public static void test() {
        int[][] test1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(averageColumnMinimum(test1));
        System.out.println(averageRowMinimum(test1));
        System.out.println();
    }
}
