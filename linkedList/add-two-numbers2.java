class Solution {
     public ListNode reverse(ListNode head)
    {
        // code here
        if(head==null || head.next==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        
        int sum=0;
        int carry=0;
        ListNode temp=new ListNode();
        ListNode head=temp;
        while(l1!=null || l2 !=null)
        {
            //sum=carry+(l1?l1.val:0)+(l2?l2.val:0);
            sum=0;
            sum=sum+carry;
            carry=0;
            if(l1!=null)
            {
                sum=sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                sum=sum+l2.val;
                l2=l2.next;
            }
            //carry=(sum>=10)?1:0;
            if(sum>9)
            {
                carry=sum/10;
                 sum=sum%10;
            }
                     
            head.next=new ListNode(sum);
            head=head.next;
            
            
        }
        if(carry!=0) head.next=new ListNode(carry);
        return reverse(temp.next);
    }
}
