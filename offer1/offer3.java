package aa;

import 链表.ListNode;

import java.util.ArrayList;

public class offer3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //方法一 反转链表
//        ListNode newNode=null;
//        ListNode prev=null;
//        ListNode cur=listNode;
//        ArrayList<Integer> al=new ArrayList<>();
//        while (cur!=null){
//            ListNode curNext=cur.next;
//            if(curNext==null){
//                newNode=cur;
//            }
//            cur.next=prev;
//            prev=cur;
//            cur=curNext;
//        }
//        while (newNode!=null){
//            al.add(newNode.val);
//            newNode=newNode.next;
//        }
//        return al;
        //方法2 递归 归的过程加入节点
        ArrayList<Integer> as=new ArrayList<>();
        helper(listNode,as);
        return as;
    }

    private void helper(ListNode listNode, ArrayList<Integer> as) {
        if(listNode==null){
            return;
        }
        if(listNode.next!=null){
            helper(listNode.next,as);
        }
        as.add(listNode.val);
    }
}
