class Solution
{
    void deleteNode(Node del)
    {
         // Your code here
         if(del.next==null) return;
         Node prev=del;
         Node curr=del.next;
         Node next=del.next.next;
         //swapping the values
         prev.data=curr.data;
         prev.next=next;
         //delete curr;
         return;
    }
}
