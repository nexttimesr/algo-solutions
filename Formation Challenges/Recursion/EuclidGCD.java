package Recursion;

public class EuclidGCD {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void test() {
        System.out.println(gcd(1, 20));
        System.out.println(gcd(20, 1));
        System.out.println(gcd(20, 20));
        System.out.println(gcd(20, 10));
        System.out.println(gcd(10, 20));
        System.out.println(gcd(20, 36));
        System.out.println(gcd(36, 20));
        System.out.println();
    }
}
