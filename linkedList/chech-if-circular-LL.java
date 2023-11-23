class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here
    Node temp=head;
    //Node curr=head;
    while(temp.next!=null){
        temp=temp.next;
        if (temp==head) return true;
        //else return false;
    }
    return false;
	
    }
}
