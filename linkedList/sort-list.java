class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        return head;

        ListNode temp=head, slow=head, fast=head;
    //find the middle
        while(fast!=null && fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;
//break into two sorted lists and merge them in a single one
        ListNode list1=sortList(head);
        ListNode list2=sortList(slow);
        return merge(list1,list2);
    }
    public ListNode merge(ListNode list1, ListNode list2)
    {
        ListNode temp=new ListNode(0);
        ListNode dummy=temp;

        while(list1!=null && list2!=null){
            if(list1.val <list2.val)
            {
            dummy.next=list1;
            list1=list1.next;
            }
            else
            {
                dummy.next=list2;
                list2=list2.next;
            }
            dummy=dummy.next;
        }
        //if elements lefts in the list
        if(list1!=null)
        {
            dummy.next=list1;
            list1=list1.next;
        }
        if(list2!=null)
        {
            dummy.next=list2;
            list2=list2.next;
        }
        return temp.next;
    }
}
