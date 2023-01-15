package Graph;
import java.util.*;

public class Converter {
    public static class AdjMatrix {
        Map<String, Integer> mappings;
        int[][] matrix;

        public AdjMatrix(Map<String, Integer> mappings, int[][] matrix) {
            this.mappings = mappings;
            this.matrix = matrix;
        }
    }
    public static AdjMatrix toAdjMatrix(String[] vertices, String[][] edges) {
        Map<String, Integer> mappings = new HashMap<>();
        for (int i = 0; i < vertices.length; i++) {
            mappings.put(vertices[i], i);
        }
        int[][] matrix = new int[vertices.length][vertices.length];
        for (String[] edge: edges) {
            matrix[mappings.get(edge[0])][mappings.get(edge[1])] = 1;
        }
        return new AdjMatrix(mappings, matrix);
    }

    public static Map<String, List<String>> toAdjList(String[] vertices, String[][] edges) {
        Map<String, List<String>> map = new HashMap<>();
        for (String v: vertices) {
            map.put(v, new ArrayList<>());
        }
        for (String[] edge: edges) {
            map.get(edge[0]).add(edge[1]);
        }
        return map;
    }

    public static void test() {
        String[] v = new String[]{"n1", "n2", "n3"};
        String[][] e = new String[][]{{"n1", "n2"}};
        AdjMatrix matrix = toAdjMatrix(v, e);
        System.out.println(matrix.mappings.toString());
        for (int[] arr: matrix.matrix) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
        System.out.println(toAdjList(v, e).toString());
        System.out.println();
    }


    // unvisited set: all nodes
    // find all airports that can be visited BFS: visit one -> remove from set
    // // see if there are any other connection between other airports ->
    // iterate through the unvisited nodes:
    //      check how many nodes can be visited starting at current node
    //      newset:
    // // A 4 B 3 C2 D 1 E 2 F 2
    // from most: BFS
    // E F
    // from most: BFS


}
