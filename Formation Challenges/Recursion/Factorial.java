package Recursion;

public class Factorial {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    public static void test() {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(10));
        System.out.println(factorial(12));
        System.out.println(factorial(5));
        System.out.println(factorial(3));
        System.out.println();
    }
}
