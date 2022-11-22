package Tree;

import java.util.*;

public class PrintByLevel {
    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                System.out.print(cur.val + " ");
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }
            System.out.println();
        }
    }
    public static void test() {
        TreeNode test1 = new TreeNode(5, new TreeNode(4, new TreeNode(3), new TreeNode(19)), new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        printTree(test1);
    }
}
