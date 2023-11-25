class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    TreeSet<Integer> set=new TreeSet<>();
        Node n1=head1;
        Node n2=head2;
        Node res=new Node(0);
        Node curr=res;
        while(n2!=null)
        {
            set.add(n2.data);
            n2=n2.next;
        }
        while(n1!=null)
        {
            set.add(n1.data);
            n1=n1.next;
        }
        for(Integer data:set)
        {
            curr.next=new Node(data);
            curr=curr.next;
        }
        return res.next;
	}
}
