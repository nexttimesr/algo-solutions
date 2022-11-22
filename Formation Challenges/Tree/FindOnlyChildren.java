package Tree;
import java.util.*;

public class FindOnlyChildren {
    public static List<Integer> findOnlyChildren(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        rec(ret, root);
        return ret;
    }

    public static void rec(List<Integer> ret, TreeNode root) {
        if (root == null) {
            return;
        }
        if ((root.left != null && root.right == null) || (root.left == null && root.right != null)) {
            ret.add(root.val);
        }
        rec(ret, root.left);
        rec(ret, root.right);
    }

    public static void test() {
        TreeNode test1 = null;
        TreeNode test2 = new TreeNode(0);
        TreeNode test3 = new TreeNode(0, new TreeNode(1), null);
        TreeNode test4 = new TreeNode(0, new TreeNode(1), new TreeNode(2));
        TreeNode test5 = new TreeNode(0, new TreeNode(1, new TreeNode(4, new TreeNode(5), null), null), new TreeNode(2, new TreeNode(6), null));
        System.out.println(findOnlyChildren(test1).toString());
        System.out.println(findOnlyChildren(test2).toString());
        System.out.println(findOnlyChildren(test3).toString());
        System.out.println(findOnlyChildren(test4).toString());
        System.out.println(findOnlyChildren(test5).toString());
        System.out.println();
    }
}
