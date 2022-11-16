package Arrays;
import java.util.*;
public class ZigZagTraversal {
    public static int[] zigZagTraversal(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[]{};
        }
        int[] ret = new int[matrix.length * matrix[0].length];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i % 2 == 0 ? 0 : matrix[i].length - 1; (i % 2 == 0 && j < matrix[i].length) || (i % 2 == 1 && j >= 0); j = i % 2 == 0 ? j + 1 : j - 1) {
                ret[count++] = matrix[i][j];
            }
        }
        return ret;
    }

    public static void test() {
        int[][] test1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] test2 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[][] test3 = new int[][]{{1, 2, 3}};
        int[][] test4 = new int[][]{};
        int[][] test5 = new int[][]{{1}, {4}, {7}};
        System.out.println(Arrays.toString(zigZagTraversal(test1)));
        System.out.println(Arrays.toString(zigZagTraversal(test2)));
        System.out.println(Arrays.toString(zigZagTraversal(test3)));
        System.out.println(Arrays.toString(zigZagTraversal(test4)));
        System.out.println(Arrays.toString(zigZagTraversal(test5)));
        System.out.println();
    }
}
