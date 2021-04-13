package aa;

import cengxu.TreeNode;

public class offer26 {
    TreeNode head;
    TreeNode last;
    public TreeNode Convert(TreeNode pRootOfTree) {
        head=last=null;
        inOrder(pRootOfTree);
        return head;
    }

    private void inOrder(TreeNode pRootOfTree) {
        if(pRootOfTree!=null){
            inOrder(pRootOfTree.left);
            add(pRootOfTree);
            inOrder(pRootOfTree.right);
        }
    }

    private void add(TreeNode node) {
        if(last==null){
            head=node;
        }else {
            last.right=node;
        }
        node.left=last;
        last=node;
    }
}
