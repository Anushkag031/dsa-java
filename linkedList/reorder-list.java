class Solution {
    public ListNode findMid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head)
    {
        if(head==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            //move foward the pointers
            prev=curr;
            curr=next;
        }
        return prev;

    } 

    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;

        ListNode mid=findMid(head);
        ListNode slow=reverse(mid);
        ListNode fast=head;

        //rearranging the list
        while(fast!=null && slow!=null)
        {
            ListNode temp=fast.next;
            fast.next=slow;
            fast=temp;

            temp=slow.next;
            slow.next=fast;
            slow=temp;
        }
        if(fast!=null) fast.next=null; //tail
        
    }
}
