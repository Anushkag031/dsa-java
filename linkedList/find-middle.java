
class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         //if(head==null || head.next==null) return null;
         Node slow=head;
         Node fast=head;
         //Node prev=null;
         while(fast!=null && fast.next!=null)
         {
             //prev=slow;
             slow=slow.next;
             fast=fast.next.next;
         }
         //prev.next=prev.next.next;
         return slow.data;
    }
}
