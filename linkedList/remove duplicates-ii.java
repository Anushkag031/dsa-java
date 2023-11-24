class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0,head);//creating new LN pointing to head
        ListNode prev=dummy;

        while(head!=null)
        {
            if(head.next!=null && head.val==head.next.val) //duplicacy
            {
                while(head.next!=null && head.val==head.next.val) 
                {
                    head=head.next; //moving head till duplicates found
                }
                prev.next=head.next; //removing duplicates
            }
            else{
                prev=prev.next;
            }
            head=head.next;
        }
        return dummy.next; //i.e head
    }
}
