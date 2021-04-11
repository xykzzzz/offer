package aa;

import cengxu.TreeNode;

public class offer18 {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if(pRoot==null){
            return null;
        }
        TreeNode temp=pRoot.left;
        pRoot.left=pRoot.right;
        pRoot.right=temp;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
}
