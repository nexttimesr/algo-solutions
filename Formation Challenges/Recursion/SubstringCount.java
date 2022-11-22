package Recursion;

public class SubstringCount {
    public static int substringCount(String str, String sub) {
        return rec(str, sub, 0);
    }

    public static int rec(String str, String sub, int ind) {
        if (str.length() - ind < sub.length())  {
            return 0;
        }
        if (str.substring(ind, ind + sub.length()).equals(sub)) {
            return 1 + rec(str, sub, ind + sub.length());
        }
        return rec(str, sub, ind + 1);
    }

    public static void test() {
        String test1 = "";
        String test2 = "cat";
        String test3 = "catttacatacat";
        String test4 = "caat";
        String test5 = "aaaaaaaaaaaa";
        String test6 = "catcatcatcat";
        String test7 = "cacacacac";
        System.out.println(substringCount(test1, "cat"));
        System.out.println(substringCount(test2, "cat"));
        System.out.println(substringCount(test3, "cat"));
        System.out.println(substringCount(test4, "cat"));
        System.out.println(substringCount(test5, "a"));
        System.out.println(substringCount(test6, "cat"));
        System.out.println(substringCount(test7, "cac"));
        System.out.println();
    }
}
