package Tree;

import java.util.*;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
        this.val = 0;
        this.left = null;
        this.right = null;
    }

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void print() {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(this);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.print(cur.val + " ");
            TreeNode left = cur.left == null ? new TreeNode(-1) : cur.left;
            TreeNode right = cur.right == null ? new TreeNode(-1) : cur.right;
            if (cur.val != -1) {
                queue.offer(left);
                queue.offer(right);
            }
        }
        System.out.println();
    }
}
