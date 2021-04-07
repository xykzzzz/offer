package aa;


import cengxu.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class offer4 {
    //[1,2,3,4,5,6,7],[3,2,4,1,6,5,7]
    //{1,2,5,3,4,6,7}
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        List<Integer> preList=arrToList(pre);
        List<Integer> inList=arrToList(in);
        return build(preList,inList);
    }

    private TreeNode build(List<Integer> preList, List<Integer> inList) {
        if(preList.isEmpty()){
            return null;
        }
        int rootVal = preList.get(0);
        TreeNode root=new TreeNode(rootVal);
        if(preList.size()==1){
            return root;
        }
        int i = inList.indexOf(rootVal);
        List<Integer> leftPre = preList.subList(1, 1 + i);
        List<Integer> rightPre = preList.subList(1 + i, preList.size());
        List<Integer> leftIn = inList.subList(0, i);
        List<Integer> rightIn = inList.subList(i + 1, inList.size());
        root.left=build(leftPre,leftIn);
        root.right=build(rightPre,rightIn);
        return root;
    }

    private List<Integer> arrToList(int[] temp) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < temp.length; i++) {
            list.add(temp[i]);
        }
        return list;
    }
}
