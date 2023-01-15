package Graph;

import java.util.*;

public class LevelMapping {
    public static Map<Integer, List<String>> levelMapping(String[][] edges, String start) {
        Map<String, List<String>> map = new HashMap<>();
        for (String[] edge: edges) {
            map.computeIfAbsent(edge[0], s -> new ArrayList<>()).add(edge[1]);
            map.computeIfAbsent(edge[1], s -> new ArrayList<>()).add(edge[0]);
        }
        Map<Integer, List<String>> ret = new HashMap<>();
        Queue<String> queue = new ArrayDeque<>();
        queue.offer(start);
        int count = 0;
        Set<String> visited = new HashSet<>();
        visited.add(start);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                ret.computeIfAbsent(count, s -> new ArrayList<>()).add(cur);
                for (String s: map.get(cur)) {
                    if (!visited.contains(s)) {
                        visited.add(s);
                        queue.offer(s);
                    }
                }
            }
            count++;
        }
        return ret;
    }

    public static void test() {
        String[][] edges = new String[][]{{"A", "B"}, {"A", "C"}, {"A", "D"}, {"D", "E"}, {"C", "D"}};
        String start = "A";
        System.out.println(levelMapping(edges, start).toString());
        System.out.println();
    }
}
