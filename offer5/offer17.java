package aa;

import cengxu.TreeNode;

public class offer17 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {

        if (root1 == null || root2 == null) {
            return false;
        }
        if (isSameTree(root1, root2)) {
            return true;
        }
        if (HasSubtree(root1.left, root2)) {
            return true;
        }
        return HasSubtree(root1.right, root2);
    }

    private boolean isSameTree(TreeNode r, TreeNode t) {
        if (t == null) {
            return true;
        }
        if (r == null) {
            return false;
        }
        return r.val == t.val && isSameTree(r.left, t.left) && isSameTree(r.right, t.right);
    }
}
