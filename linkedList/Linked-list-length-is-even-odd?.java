class GFG
{
	int isLengthEvenorOdd(Node head1)
	{
	    //Add your code here.
	    Node temp=head1;
	    int count=0;
	    while(temp!=null)
	    {
	        temp=temp.next;
	        count++;
	    }
	    //return count;
	    
	    if(count%2==0) return 0;
	    else return 1;
	}
}
