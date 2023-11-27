class Solution {
    //public ListNode swap()
    public ListNode swapNodes(ListNode head, int k) {
        ListNode p1=head,p2=head,temp=null;
        for (int i = 1; i < k; i++) {
            p1 = p1.next;
        }
        temp=p1;
        p1=p1.next;
        while(p1!=null)
        {
            p1=p1.next;
            p2=p2.next;
        }
        //swap(p2.val,temp);
       int p3=p2.val;
       p2.val=temp.val;
       temp.val=p3;  
        return head;
        
    }
}
