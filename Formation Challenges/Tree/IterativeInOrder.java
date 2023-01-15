package Tree;
import java.util.*;

public class IterativeInOrder {
    public static List<Integer> iiot(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        Deque<TreeNode> s = new ArrayDeque<>();
//        Deque<Boolean> visited = new ArrayDeque<>();
//        visited.push(false);

        while (!s.isEmpty() || root != null) {
            if (root != null) {
                s.push(root);
                root = root.left;
                continue;
            }
            if (root == null) {
                TreeNode cur = s.pop();
                ret.add(cur.val);
                root = cur.right;
            }
//            TreeNode cur = s.pop();
//            boolean isVisited = visited.pop();
//            if (isVisited) {
//                ret.add(cur.val);
//                continue;
//            }
//            if (cur.right != null) {
//                s.push(cur.right);
//                visited.push(false);
//            }
//            s.push(cur);
//            visited.push(true);
//            if (cur.left != null) {
//                s.push(cur.left);
//                visited.push(false);
//            }
        }
        return ret;
    }

    public static void test() {
        TreeNode tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        TreeNode tree2 = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));

        TreeNode tree3 = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(8), new TreeNode(9)), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        System.out.println(iiot(tree1).toString());
        System.out.println(iiot(tree2).toString());
        System.out.println(iiot(tree3).toString());
        System.out.println(iiot(null).toString());
        System.out.println();
    }
}
