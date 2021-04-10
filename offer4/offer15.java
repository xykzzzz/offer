package aa;


import 链表.ListNode;

public class offer15 {
    public ListNode ReverseList(ListNode head) {
        ListNode newNode=null;
        ListNode prev=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode curNext=cur.next;
            if(curNext==null){
                newNode=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newNode;
    }
}
