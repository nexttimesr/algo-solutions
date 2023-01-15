package Graph;
import java.util.*;

public class EdgeList {
    public static int sum(int n, int[][] edges, int start) {
        if (start < 1 || start > n) return 0;
        List<Integer>[] adjList = getAdjList(n, edges);
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(start);
        Set<Integer> visited = new HashSet<>();
        visited.add(start);
        int sum = 0;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            sum += cur;
            for (int i: adjList[cur]) {
                if (!visited.contains(i)) {
                    visited.add(i);
                    queue.offer(i);
                }
            }
        }
        return sum;
    }

    public static int dfsSum(int n, int[][] edges, int start) {
        if (start < 1 || start > n) return 0;
        List<Integer>[] adjList = getAdjList(n, edges);
        Set<Integer> visited = new HashSet<>();
        visited.add(1);
        return helper(adjList, start, visited);
    }

    public static int helper(List<Integer>[] adjList, int index, Set<Integer> visited) {
        if (index == adjList.length || visited.contains(adjList[index])) return 0;
        int sum = index;
        for (int v: adjList[index]) {
            if (visited.contains(v)) continue;
            visited.add(v);
            sum += helper(adjList, v, visited);
        }
        return sum;
    }

    public static List<Integer>[] getAdjList(int n, int[][] edges) {
        List<Integer>[] adjList = new List[n + 1];
        for (int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int[] edge: edges) {
            adjList[edge[0]].add(edge[1]);
            adjList[edge[1]].add(edge[0]);
        }
        return adjList;
    }

    public static void test() {

        int[][] edgeList = new int[][]{{1, 2}, {2, 3}, {1, 3}};
        int[][] edgeList2 = new int[][]{{2, 1}, {3, 2}, {3, 1}};
        System.out.println(sum(5, edgeList, 1));
        System.out.println(sum(5, edgeList, 10000));
        System.out.println(sum(5, edgeList, 4));
        System.out.println();
        System.out.println(sum(5, edgeList2, 1));
        System.out.println(sum(5, edgeList2, 10000));
        System.out.println(sum(5, edgeList2, 4));
        System.out.println();
        System.out.println(dfsSum(5, edgeList, 1));
        System.out.println(dfsSum(5, edgeList, 10000));
        System.out.println(dfsSum(5, edgeList, 4));
        System.out.println();
        System.out.println(dfsSum(5, edgeList2, 1));
        System.out.println(dfsSum(5, edgeList2, 10000));
        System.out.println(dfsSum(5, edgeList2, 4));
        System.out.println();
    }
}
