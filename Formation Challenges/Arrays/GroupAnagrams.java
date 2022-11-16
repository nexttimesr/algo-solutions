package Arrays;
import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> ga(String[] arr) {
        List<List<String>> ret = new ArrayList<>();
        Map<Map<Character, Integer>, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Map<Character, Integer> word = new HashMap<>();
            for (char c: arr[i].toCharArray()) {
                word.put(c, word.getOrDefault(c, 0) + 1);
            }
            if (map.containsKey(word)) {
                ret.get(map.get(word)).add(arr[i]);
            }
            else {
                map.put(word, ret.size());
                ret.add(new ArrayList<>());
                ret.get(ret.size() - 1).add(arr[i]);
            }
        }
        return ret;
    }

    public static void test() {
        String[] test1 = new String[]{"yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"};
        String[] test2 = new String[]{"cat", "act", "a", "tac"};
        String[] test3 = new String[]{"a", "ab", "ba"};
        String[] test4 = new String[0];
        String[] test5 = new String[]{"test"};
        System.out.println(ga(test1).toString());
        System.out.println(ga(test2).toString());
        System.out.println(ga(test3).toString());
        System.out.println(ga(test4).toString());
        System.out.println(ga(test5).toString());
        System.out.println();
    }
}
