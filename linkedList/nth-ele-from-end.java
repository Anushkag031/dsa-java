class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here	
    	Node temp=head,curr=head;
    
    	for(int i=1; i<n; i++){
    	temp=temp.next; //n ele tk gya
    	if(temp==null) return -1;
    	}
    	while(temp.next!=null) // move curr and temp both
    	{ 
    	    //see notebook for explanation
    	     curr=curr.next; // give Nth ele (total-n)
    	     temp=temp.next;
    	   
    	}
    	return curr.data;
    }
}
