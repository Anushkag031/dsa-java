class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // add your code here Node sortedMerge(Node head1, Node head2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
     if(head==null || head.next==null)
        return head;

        Node temp=head, slow=head, fast=head;
    //find the middle
        while(fast!=null && fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;
//break into two sorted lists and merge them in a single one
        Node list1=mergeSort(head);
        Node list2=mergeSort(slow);
        return merge(list1,list2);
    }
    static Node merge(Node head1, Node head2)
    {
    
        Node temp=new Node(0);
        Node dummy=temp;

        while(head1!=null && head2!=null){
            if(head1.data <head2.data)
            {
            dummy.next=head1;
            head1=head1.next;
            }
            else
            {
                dummy.next=head2;
                head2=head2.next;
            }
            dummy=dummy.next;
        }
        //if elements lefts in the list
        if(head1!=null)
        {
            dummy.next=head1;
            head1=head1.next;
        }
        if(head2!=null)
        {
            dummy.next=head2;
            head2=head2.next;
        }
        return temp.next;
    }
}
