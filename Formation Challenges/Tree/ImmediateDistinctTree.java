package Tree;

public class ImmediateDistinctTree {
    public static boolean isImmediateDistinct(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean ret = true;
        if (root.left != null) {
            ret = ret && root.left.val != root.val;
        }
        if (root.right != null) {
            ret = ret && root.right.val != root.val;
        }
        return ret && isImmediateDistinct(root.left) && isImmediateDistinct(root.right);
    }

    public static void test() {
        TreeNode test1 = new TreeNode(1, new TreeNode(1, new TreeNode(3), new TreeNode(4)), new TreeNode(2, null, new TreeNode(6)));
        TreeNode test2 = new TreeNode(1, new TreeNode(2, new TreeNode(5), new TreeNode(9)), new TreeNode(2));
        TreeNode test3 = new TreeNode(2, new TreeNode(5), new TreeNode(9));
        TreeNode test3point5 = new TreeNode(2);
        TreeNode test4 = new TreeNode(1, new TreeNode(5), new TreeNode(1));
        TreeNode test5 = new TreeNode(1, new TreeNode(2), new TreeNode(2));
        TreeNode test6 = new TreeNode(1, new TreeNode(2, new TreeNode(1), null), null);
        TreeNode test7 = new TreeNode(1, new TreeNode(1, new TreeNode(1), new TreeNode(1)), null);
        TreeNode test8 = new TreeNode(6, new TreeNode(8, new TreeNode(4), new TreeNode(8)), null);
        TreeNode test9 = new TreeNode(6, new TreeNode(8, new TreeNode(4, new TreeNode(8), null),null), null);
        TreeNode test10 = new TreeNode(6, new TreeNode(8, new TreeNode(4, new TreeNode(6), null), null), null);
        TreeNode test0 = null;
        System.out.println(isImmediateDistinct(test0));
        System.out.println(isImmediateDistinct(test1));
        System.out.println(isImmediateDistinct(test2));
        System.out.println(isImmediateDistinct(test3));
        System.out.println(isImmediateDistinct(test3point5));
        System.out.println(isImmediateDistinct(test4));
        System.out.println(isImmediateDistinct(test5));
        System.out.println(isImmediateDistinct(test6));
        System.out.println(isImmediateDistinct(test7));
        System.out.println(isImmediateDistinct(test8));
        System.out.println(isImmediateDistinct(test9));
        System.out.println(isImmediateDistinct(test10));
        System.out.println();
    }
}

