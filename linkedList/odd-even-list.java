class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenstart=even;
        while(even!=null && even.next!=null)
        {
            //breaking into two different lists

            //1.odd list
            odd.next=even.next;
            odd=odd.next;

            //2.even list
            even.next=odd.next;
            even=even.next;
        }
        //connecting odd and even lists
        odd.next=evenstart;
        return head;
    }
}
