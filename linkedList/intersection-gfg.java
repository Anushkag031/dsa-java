class Solution
{
    
    public static Node findIntersection(Node head1, Node head2)
    {
        // add your code here
        // return the head of intersection list
        HashSet<Integer> set=new HashSet<>();
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
            if(set.contains(n1.data))
            {
                Node n=new Node(n1.data);
                curr.next=n;
                curr=n;
            }
            
            n1=n1.next;
        }
        return res.next;
    }
}
