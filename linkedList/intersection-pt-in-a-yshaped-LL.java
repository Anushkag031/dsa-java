class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         
          if(head1==null||head2==null) return -1;
        Node tail1=head1;
        Node tail2=head2;
        while(tail1!=tail2)
        {
            //if(tail1==tail2) return tail1.data;
            //return -1;
            if(tail1==null) tail1=head2;
            else tail1=tail1.next;
            if(tail2==null) tail2=head1;
            else  tail2=tail2.next;
        }
        if(tail1==null) return -1;
        return tail1.data;
	}
}
