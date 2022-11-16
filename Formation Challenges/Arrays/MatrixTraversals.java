package Arrays;
import java.util.*;

public class MatrixTraversals {
    public static int[] matrixTraversal1(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int[] ret = new int[matrix.length * matrix[0].length];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                ret[count++] = matrix[i][j];
            }
        }
        return ret;
    }
    public static int[] matrixTraversal2(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int[] ret = new int[matrix.length * matrix[0].length];
        int count = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                ret[count++] = matrix[i][j];
            }
        }
        return ret;
    }
    public static int[] matrixTraversal3(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int[] ret = new int[matrix.length * matrix[0].length];
        int count = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix[i].length; j++) {
                ret[count++] = matrix[i][j];
            }
        }
        return ret;
    }
    public static int[] matrixTraversal4(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int[] ret = new int[matrix.length * matrix[0].length];
        int count = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                ret[count++] = matrix[i][j];
            }
        }
        return ret;
    }
    public static int[] matrixTraversal5(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int[] ret = new int[matrix.length * matrix[0].length];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                ret[count++] = matrix[i][j];
            }
        }
        return ret;
    }
    public static int[] matrixTraversal6(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int[] ret = new int[matrix.length * matrix[0].length];
        int count = 0;
        for (int j = matrix[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < matrix.length; i++) {
                ret[count++] = matrix[i][j];
            }
        }
        return ret;
    }
    public static int[] matrixTraversal7(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int[] ret = new int[matrix.length * matrix[0].length];
        int count = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = matrix.length - 1; i >= 0; i--) {
                ret[count++] = matrix[i][j];
            }
        }
        return ret;
    }
    public static int[] matrixTraversal8(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int[] ret = new int[matrix.length * matrix[0].length];
        int count = 0;
        for (int j = matrix[0].length - 1; j >= 0; j--) {
            for (int i = matrix.length - 1; i >= 0; i--) {
                ret[count++] = matrix[i][j];
            }
        }
        return ret;
    }

    public static void test() {
        int[][] test1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(matrixTraversal1(test1)));
        System.out.println(Arrays.toString(matrixTraversal2(test1)));
        System.out.println(Arrays.toString(matrixTraversal3(test1)));
        System.out.println(Arrays.toString(matrixTraversal4(test1)));
        System.out.println(Arrays.toString(matrixTraversal5(test1)));
        System.out.println(Arrays.toString(matrixTraversal6(test1)));
        System.out.println(Arrays.toString(matrixTraversal7(test1)));
        System.out.println(Arrays.toString(matrixTraversal8(test1)));
        System.out.println();
    }
}
