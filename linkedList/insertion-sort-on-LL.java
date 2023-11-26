class Solution
{
    public static Node insertionSort(Node head)
    {
        //code here
         Node dummy=new Node(0);

        while(head!=null)
        {
           Node next=head.next;
            Node temp=dummy;

            while(temp.next!=null && temp.next.data<head.data)
            {
                temp=temp.next;
            }
            head.next=temp.next;
            temp.next=head;
            head=next;
        }
        return dummy.next;
    }
    
}
