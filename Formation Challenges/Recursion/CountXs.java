package Recursion;

public class CountXs {
    public static int countXs(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return rec(str, 0, str.length() - 1);
    }
    public static int rec(String str, int start, int end) {
        if (start == end) {
            return str.charAt(start) == 'x' ? 1 : 0;
        }
        int mid = start + (end - start) / 2;
        return rec(str, start, mid) + rec(str, mid + 1, end);
    }

    public static void test() {
        String test1 = "xxxxsaxx";
        String test2 = "xxxxxxxx";
        String test3 = "asjbfiasfo";
        String test4 = "";
        String test5 = "a";
        String test6 = "x";
        System.out.println(countXs(test1));
        System.out.println(countXs(test2));
        System.out.println(countXs(test3));
        System.out.println(countXs(test4));
        System.out.println(countXs(test5));
        System.out.println(countXs(test6));
        System.out.println();
    }
}
