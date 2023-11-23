class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        if (head == null) 
        head = new Node(data); 
        
        
        Node slow=head;
        Node fast=head;
        
        Node temp=new Node(data);
        while(fast.next!=null && fast.next.next!=null)
        {
            
            slow=slow.next;
            fast=fast.next.next;
            
        }
        temp.next=slow.next;//connecting to last node
        slow.next=temp;//connecting with slow
        return head;
    }
}
