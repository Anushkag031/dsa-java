class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode list1=new ListNode(0); //to add ele less than x
        ListNode list2=new ListNode(0); //to add ele greater or eq to x

        ListNode l1=list1; 
        ListNode l2=list2;

        while(head!=null)
        {
            if(head.val<x)
            {
                l1.next=head;
                l1=l1.next;
            }
            else
            {
                l2.next=head;
                l2=l2.next;
            }
            head=head.next;
        }
        l1.next=list2.next;
        l2.next=null; //making last ele null to avoid cycle
        return list1.next;
    }
}
