package Tree;

public class MaxPathSum {
    static int max = 0;
    public static int maxPathSum(TreeNode root) {
        max = 0;
        if (root == null) {
            return 0;
        }
        rec(root, 0);
        return max;
    }

    public static int rec(TreeNode root, int sum) {
        if (root == null) {
            return sum;
        }
        sum += root.val;
        int left = rec(root.left, 0);
        int right = rec(root.right, 0);
        max = Math.max(max, left + root.val + right);
        return Math.max(0, Math.max(rec(root.left, sum), rec(root.right, sum)));
    }
    public static void test() {
        TreeNode test1 = new TreeNode(1, new TreeNode(2, new TreeNode(-1), null), new TreeNode(3, new TreeNode(5), new TreeNode(6)));
        TreeNode test2 = new TreeNode(1, new TreeNode(2, new TreeNode(-1), null), new TreeNode(3));
        TreeNode test3 = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        TreeNode test4 = new TreeNode(1, new TreeNode(2), new TreeNode(-4));
        TreeNode test5 = new TreeNode(1, new TreeNode(-5, new TreeNode(6), null), new TreeNode(5));
        TreeNode test6 = new TreeNode(1, new TreeNode(-10, new TreeNode(3, new TreeNode(5, new TreeNode(13), new TreeNode(-1)), new TreeNode(-1)), null), new TreeNode(-5, new TreeNode(-20), new TreeNode(-21)));
        System.out.println(maxPathSum(test1));
        System.out.println(maxPathSum(test2));
        System.out.println(maxPathSum(test3));
        System.out.println(maxPathSum(test4));
        System.out.println(maxPathSum(test5));
        System.out.println(maxPathSum(test6));
        System.out.println();
    }
}
