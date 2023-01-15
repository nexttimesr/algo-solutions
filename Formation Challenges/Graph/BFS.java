package Graph;

import java.util.*;

public class BFS {
    public static boolean hasPathTo(Node node, Node target) {
        if (node == null) {
            return false;
        }
        Queue<Node> queue = new ArrayDeque<>();
        Set<Node> set = new HashSet<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node cur = queue.poll();
                if (cur == target) {
                    return true;
                }
                for (Node n: cur.children) {
                    if (!set.contains(n)) {
                        queue.offer(n);
                        set.add(n);
                    }
                }
            }
        }
        return false;
    }

    public static boolean hasPathToRec(Node node, Node target, Set<Node> set){
        if (node == null) {
            return false;
        }
        if (node == target) {
            return true;
        }
        boolean res = false;
        for (Node n: node.children) {
            if (set.contains(n)) {
                continue;
            }
            set.add(n);
            res = res || hasPathToRec(n, target, set);
        }
        return res;
    }

    public static void test() {
        Node node2 = new Node(2);

        Node node1 = new Node(1, Arrays.asList(node2, new Node(3)));

        Node node4 = new Node(4, Arrays.asList(node1));

        Node node5 = new Node(5, Arrays.asList(node1, node4));

        Node node6 = new Node(6);

        Node node7 = new Node(1);

        Node node8 = new Node(2);

        Node node9 = new Node(3);

        node7.children = Arrays.asList(node8);

        node8.children = Arrays.asList(node9);

        node9.children = Arrays.asList(node7);

        System.out.println(hasPathTo(node5, node2));
        System.out.println(hasPathTo(node6, node1));
        System.out.println(hasPathTo(node1, node4));
        System.out.println(hasPathTo(node7, node9));
        System.out.println(hasPathTo(node7, node1));
        System.out.println();
    }
}
