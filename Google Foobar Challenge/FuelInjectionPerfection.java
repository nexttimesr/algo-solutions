import java.util.*;

public class FuelInjectionPerfection {
    public static int solution(String x) {
        // Your code here
        Map<String, Integer> mem = new HashMap<>();
        mem.put("1", 0);
        rec(x, mem, 0);
        return mem.get(x);
    }

    public static void rec(String x, Map<String, Integer> mem, int count) {
        if (mem.containsKey(x)) {
            return;
        }
        if ((x.charAt(x.length() - 1) - '0') % 2 == 0) {
            String divided = divide(x);
            rec(divided, mem, count + 1);
            mem.put(x, mem.get(divided) + 1);
        }
        else {
            String add = addorminus(x, true);
            String minus = addorminus(x, false);
            rec(add, mem, count + 1);
            rec(minus, mem, count + 1);
            mem.put(x, 1 + Math.min(mem.get(add), mem.get(minus)));
        }
    }
    public static String divide(String x) {
        StringBuilder sb = new StringBuilder();
        boolean bring = false;
        int i = 0;
        if (x.charAt(0) - '0' == 1) {
            i = 1;
            bring = true;
        }
        for (; i < x.length(); i++) {
            int cur = x.charAt(i) - '0';
            if (bring) {
                cur += 10;
                bring = false;
            }
            if (cur % 2 == 0) {
                sb.append(cur / 2);
            }
            else {
                if (i == 0 && cur == 1) {
                    bring = true;
                }
                else {
                    bring = true;
                    sb.append(cur / 2);
                }
            }
        }
        return sb.toString();
    }
    public static String addorminus(String x, boolean add) {
        StringBuilder sb = new StringBuilder(x);
        char c = x.charAt(x.length() - 1);
        if (add) {
            if (c == '9') {
                sb.setCharAt(x.length() - 1, '0');
                int i = x.length() - 2;
                for (; i >= 0; i--) {
                    if (sb.charAt(i) != '9') {
                        sb.setCharAt(i, (char)(sb.charAt(i) + 1));
                        break;
                    }
                    sb.setCharAt(i, '0');
                }
                if (i == -1) {
                    sb.insert(0, '1');
                }
            }
            else {
                sb.setCharAt(x.length() - 1, (char)(c + 1));
            }
        }
        else {
            sb.setCharAt(x.length() - 1, (char)(c - 1));
        }
        return sb.toString();
    }

}
