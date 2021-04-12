package aa;

import cengxu.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class offer22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> a=new ArrayList<>();
        if(root==null){
            return a;
        }
        Deque<TreeNode> deque=new LinkedList<>();
        deque.add(root);
        while (!deque.isEmpty()){
            TreeNode e = deque.remove();
            a.add(e.val);
            if(e.left!=null){
                deque.add(e.left);
            }
            if(e.right!=null){
                deque.add(e.right);
            }
        }
        return a;
    }
}
