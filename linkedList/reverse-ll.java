class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        if(head==null || head.next==null) return head;
        Node prev=null;
        Node curr=head;
        Node next;
        
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            
            prev=curr;
            curr=next;
        }
        return prev;
        
        
        
        
        
        
       /* Node newhead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        
        return newhead; */
    }
}
