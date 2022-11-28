package Recursion;
import java.util.*;

public class AllTernaryNumbers {
    public static List<String> generateNDigitTernaries(int n) {
        List<String> ret = new ArrayList<>();
        rec(ret, new StringBuilder(), n);
        return ret;
    }

    public static void rec(List<String> ret, StringBuilder curStr, int n) {
        if (curStr.length() == n) {
            if (curStr.charAt(0) != '0' || n == 1) {
                ret.add(curStr.toString());
            }
            return;
        }
        for (int i = 0; i < 3; i++) {
            curStr.append(i);
            rec(ret, curStr, n);
            curStr.deleteCharAt(curStr.length() - 1);
        }
    }
    public static void test() {
        System.out.println(generateNDigitTernaries(1).toString());
        System.out.println(generateNDigitTernaries(2).toString());
        System.out.println(generateNDigitTernaries(3).toString());
        System.out.println(generateNDigitTernaries(4).size());
        System.out.println(generateNDigitTernaries(5).size());
        System.out.println(generateNDigitTernaries(6).size());
        System.out.println(generateNDigitTernaries(7).size());
        System.out.println(generateNDigitTernaries(8).size());
        System.out.println(generateNDigitTernaries(9).size());
        System.out.println(generateNDigitTernaries(10).size());
        System.out.println();
    }
}
