lass Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        // code here
       Node curr=new Node(x);
       curr.next=head;
       return curr;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node curr=new Node(x);
        if(head==null)
        {
            return curr;
        }
        curr=head;
        while(curr.next!=null){
        curr=curr.next;
        }
        curr.next=new Node(x);
        return head;
        
    }
}
