class Solution {
    public ListNode rotateRight(ListNode head, int k) {
      
     if (k<=0||head==null|| head.next==null)  return head;

        int length=1;
        ListNode last=head;				
        while (last.next!=null)
        {
            last=last.next;
            length++;
        }
        last.next=head;		
        int roatation=k%length;
		// no of skip to get desired new last node 
        int skip=length-roatation;
        ListNode newLast=head;				
        for (int i = 0; i < skip-1; i++)
        {
            newLast=newLast.next;
        }
		// Pointing new Last to new head;
        head=newLast.next;		
        newLast.next=null;
        return head; 
    }
}
