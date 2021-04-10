package aa;

import 链表.ListNode;

public class offer16 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode FakeHead=new ListNode(-1);
        ListNode temp=FakeHead;
        while (list1!=null&&list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                temp=temp.next;
                list1=list1.next;
            }else {
                temp.next=list2;
                temp=temp.next;
                list2=list2.next;
            }
        }
        if(list1!=null){
            temp.next=list1;
        }
        if(list2!=null){
            temp.next=list2;
        }
        return FakeHead.next;
    }
}
