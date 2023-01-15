package Tree;

public class LowestCommonAncestor {
    static int res = -1;
    public static int lca(TreeNode root, TreeNode node1, TreeNode node2) {
//        lcaHelper(root, node1, node2);
//        return res;
        return lcaHelper(root, node1, node2).val;
    }
    public static TreeNode lcaHelper(TreeNode root, TreeNode node1, TreeNode node2) {
        if (root == null) {
            return null;
        }
        if (root == node1 || root == node2) {
            return root;
        }
        TreeNode left = lcaHelper(root.left, node1, node2);
        TreeNode right = lcaHelper(root.right, node1, node2);
        if (left == null && right == null) {
            return null;
        }
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
    }
//    public static int lcaHelper(TreeNode root, TreeNode node1, TreeNode node2) {
//        if (root == null) {
//            return 0;
//        }
//        int cur = 0;
//        if (root == node1) {
//            cur++;
//        }
//        if (root == node2) {
//            cur++;
//        }
//        int left = lcaHelper(root.left, node1, node2);
//        int right = lcaHelper(root.right, node1, node2);
//        if (left == 2) {
//            return left;
//        }
//        if (right == 2) {
//            return right;
//        }
//        if (left + right + cur == 2) {
//            res = root.val;
//        }
//        return left + right + cur;
//    }

    public static void test() {
        TreeNode tree1 = new TreeNode(10, new TreeNode(5, new TreeNode(3), new TreeNode(6)), new TreeNode(12, new TreeNode(11), null));

        System.out.println(lca(tree1, tree1.left.left, tree1.left.right));
        System.out.println(lca(tree1, tree1.right.left, tree1.left.right));
        System.out.println(lca(tree1, tree1.left.right, tree1));
        System.out.println(lca(tree1, tree1.right, tree1.right.left));
        System.out.println(lca(tree1, tree1.left.right, tree1.right.left));
        System.out.println();
    }
}
