class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) 
        return null;
        ListNode slow=head,fast=head;
        //ListNode fast=head;
        ListNode prev=null;  //prev.next=head;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}
