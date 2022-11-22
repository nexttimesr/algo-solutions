package Tree;
import java.util.*;

class LockableTreeNode extends TreeNode {
    public int val;
    public LockableTreeNode left;
    public LockableTreeNode right;
    public LockableTreeNode parent;
    public boolean locked;
    public int lockedChildren;

    public LockableTreeNode() {
        this.lockedChildren = 0;
        this.val = 0;
        this.left = null;
        this.right = null;
        this.locked = false;
    }

    public LockableTreeNode(int val) {
        this.lockedChildren = 0;
        this.val = val;
        this.left = null;
        this.right = null;
        this.locked = false;
    }

    public LockableTreeNode(int val, LockableTreeNode left, LockableTreeNode right) {
        this.lockedChildren = 0;
        this.val = val;
        this.left = left;
        this.right = right;
        if (left != null) {
            left.parent = this;
        }
        if (right != null) {
            right.parent = this;
        }
        this.locked = false;
    }

    public boolean isLocked() {
        return this.locked;
    }

    public boolean lock() {
        LockableTreeNode par = this.parent;
        while (par != null) {
            if (par.isLocked()) {
                return false;
            }
            par = par.parent;
        }
        par = this.parent;
        if (this.lockedChildren == 0) {
            while (par != null) {
                par.lockedChildren++;
                par = par.parent;
            }
            locked = true;
            return true;
        }
        return false;
    }
    public boolean unlock() {
        LockableTreeNode par = this.parent;
        while (par != null) {
            if (par.isLocked()) {
                return false;
            }
            par = par.parent;
        }
        par = this.parent;
        if (this.lockedChildren == 0) {
            while (par != null) {
                par.lockedChildren--;
                par = par.parent;
            }
            locked = false;
            return true;
        }
        return false;
    }
}
public class LockableBinaryTree {
    public static void test() {
        LockableTreeNode test1 = new LockableTreeNode(1, new LockableTreeNode(2, new LockableTreeNode(3, new LockableTreeNode(4), new LockableTreeNode(5)), new LockableTreeNode(6)), new LockableTreeNode(7, new LockableTreeNode(8, new LockableTreeNode(9, new LockableTreeNode(12), new LockableTreeNode(13)), new LockableTreeNode(10, new LockableTreeNode(14), new LockableTreeNode(15))), new LockableTreeNode(11, new LockableTreeNode(16, new LockableTreeNode(17), new LockableTreeNode(18)), new LockableTreeNode(19))));
        System.out.println(test1.lock());
        System.out.println(test1.left.left.left.lock());
        System.out.println(test1.unlock());
        System.out.println(test1.right.right.right.lock());
        System.out.println(test1.left.lock());
        System.out.println(test1.lock());
        System.out.println(test1.left.unlock());
        System.out.println(test1.lock());
        System.out.println(test1.right.right.right.unlock());
        System.out.println(test1.lock());
        System.out.println();
    }
}
