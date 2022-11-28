package Recursion;

public class Atoi {
    public static int atoi(String str) {
        int negative = str.length() > 0 && str.charAt(0) == '-' ? -1 : 1;
        str = str.length() > 0 && str.charAt(0) == '-' ? str.substring(1) : str;
        return negative * atoi(str, 0);
    }

    public static int atoi(String str, int cur) {
        if (str.length() == 0) {
            return cur;
        }
        return atoi(str.substring(1), cur * 10 + (str.charAt(0) - '0'));
    }

    public static void test() {
        String test1 = "123";
        String test2 = "00007";
        String test3 = "4";
        String test4 = "0";
        String test5 = "-9442200";
        String test6 = "00084400";
        System.out.println(atoi(test1));
        System.out.println(atoi(test2));
        System.out.println(atoi(test3));
        System.out.println(atoi(test4));
        System.out.println(atoi(test5));
        System.out.println(atoi(test6));
        System.out.println();
    }
}
