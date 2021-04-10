package aa;

import 链表.ListNode;

public class offer14 {
    public ListNode FindKthToTail (ListNode pHead, int k) {
        // write code here
        if(k<=0||pHead==null){
            return null;
        }
        ListNode fast=pHead;
        ListNode slow=pHead;
        while (k-1>0){
            if(fast.next!=null){
                fast=fast.next;
                k--;
            }else {
                return null;
            }
        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
