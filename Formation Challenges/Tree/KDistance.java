package Tree;
import java.util.*;
public class KDistance {

    public static List<Integer> kDistance(TreeNode root, int target, int k) {
        List<Integer> ret = new ArrayList<>();
        Map<TreeNode, TreeNode> parentMapping = new HashMap<>();
        getParents(root, parentMapping);
        TreeNode targetNode = search(root, target);
        kDistanceBelow(ret, targetNode, k, target);
        while (k > 0 && targetNode != root) {
            targetNode = parentMapping.get(targetNode);
            k--;
            kDistanceBelow(ret, targetNode, k, target);
        }
        return ret;
    }

    public static void kDistanceBelow(List<Integer> ret, TreeNode targetNode, int k, int target) {
        if (targetNode == null) return;
        if (k == 0 && targetNode.val != target) {
            ret.add(targetNode.val);
            return;
        }
        kDistanceBelow(ret, targetNode.left, k - 1, target);
        kDistanceBelow(ret, targetNode.right, k - 1, target);
    }

    public static void getParents(TreeNode root, Map<TreeNode, TreeNode> parentMapping) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            parentMapping.put(root.left, root);
            getParents(root.left, parentMapping);
        }
        if (root.right != null) {
            parentMapping.put(root.right, root);
            getParents(root.right, parentMapping);
        }
    }

    public static TreeNode search(TreeNode root, int target) {
        if (root == null) {
            return null;
        }
        if (root.val == target) {
            return root;
        }
        TreeNode left = search(root.left, target);
        TreeNode right = search(root.right, target);
        if (left == null) return right;
        else return left;
    }

    public static void test() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(8),
                                new TreeNode(9)),
                        new TreeNode(5,
                                new TreeNode(10),
                                new TreeNode(11))),
                new TreeNode(3,
                        new TreeNode(6,
                                new TreeNode(12),
                                new TreeNode(13)),
                        new TreeNode(7,
                                new TreeNode(14),
                                new TreeNode(15))));
        System.out.println(kDistance(root, 2, 2).toString());
        System.out.println(kDistance(root, 6, 2).toString());
        System.out.println(kDistance(root, 3, 1).toString());
        System.out.println();
    }
}
