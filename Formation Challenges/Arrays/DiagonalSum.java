package Arrays;

public class DiagonalSum {
    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }
    public static void test() {
        int[][] test1 = new int[0][0];
        int[][] test2 = new int[][]{{100}};
        int[][] test3 = new int[][]{{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int[][] test4 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(test1));
        System.out.println(diagonalSum(test2));
        System.out.println(diagonalSum(test3));
        System.out.println(diagonalSum(test4));
        System.out.println();
    }
}
