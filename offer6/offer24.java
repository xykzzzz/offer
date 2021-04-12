package aa;

import cengxu.TreeNode;

import java.util.ArrayList;

public class offer24 {
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
         ArrayList<Integer> path=new ArrayList<>();
        if(root==null){
            return res;
        }
        dfs(root,target,path,res);
        return res;
    }

    private static void dfs(TreeNode root, int target,ArrayList<Integer> path,ArrayList<ArrayList<Integer>> res) {
       if(root==null){
           return;
       }
        path.add(root.val);
       target=target-root.val;
        if(target==0&&root.left==null&&root.right==null){
            res.add(new ArrayList<>(path));
        }
        dfs(root.left,target,path,res);
        dfs(root.right,target,path,res);
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        TreeNode node1=new TreeNode(5);
        TreeNode node2=new TreeNode(4);
        TreeNode node3=new TreeNode(7);
        TreeNode node4=new TreeNode(12);
        root.left=node1;
        root.right=node4;
        node1.left=node2;
        node1.right=node3;
        System.out.println(FindPath(root, 22));
    }
}
