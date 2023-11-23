class Solution {
    public ListNode findMid(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head)
    {
        if(head==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            //move foward the pointers
            prev=curr;
            curr=next;
        }
        return prev;

    } 

    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;

        ListNode mid=findMid(head);
        ListNode slow=reverse(mid);
        ListNode fast=head;

        //rearranging the list
        while(fast!=null && slow!=null)
        {
            ListNode temp=fast.next;
            fast.next=slow;
            fast=temp;

            temp=slow.next;
            slow.next=fast;
            slow=temp;
        }
        if(fast!=null) fast.next=null; //tail
        
    }
}
/* unction with the input linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7.

Initially, head points to the head of the linked list (1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7).
findMid(head):
The slow and fast pointers start at the head (both at 1).
In the first iteration, slow moves to 2, and fast moves to 3.
In the second iteration, slow moves to 3, and fast moves to 5.
In the third iteration, slow moves to 4, and fast moves to 7.
In the fourth iteration, slow moves to 5, and fast moves to null (end of the list).
The middle of the list is found, and mid now points to the node with the value 4.
reverse(mid):
The second half of the list is reversed. In this case, the list becomes: 7 -> 6 -> 5.
reorderList(head):
mid now points to the reversed second half (7 -> 6 -> 5).
slow is set to the reversed list (7 -> 6 -> 5).
fast is set back to the head of the original list (1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7).
The loop for rearranging the list begins:
The first iteration:
temp is set to the next node of fast, which is 2.
fast.next is set to slow, so 1 -> 7.
fast is set to temp, which is 2.
temp is set to the next node of slow, which is 6.
slow.next is set to fast, so 7 -> 2.
slow is set to temp, which is 6.
The second iteration:
temp is set to the next node of fast, which is 3.
fast.next is set to slow, so 2 -> 6.
fast is set to temp, which is 3.
temp is set to the next node of slow, which is 5.
slow.next is set to fast, so 6 -> 3.
slow is set to temp, which is 5.
The third iteration:
temp is set to the next node of fast, which is 4.
fast.next is set to slow, so 3 -> 5.
fast is set to temp, which is 4.
temp is set to the next node of slow, which is null.
slow.next is set to fast, so 5 -> 4.
slow is set to temp, which is null.
The loop exits, and if there are remaining nodes in fast, their next pointers are set to null. In this case, fast is already null, so nothing changes.
The reordered list is now: 1 -> 7 -> 2 -> 6 -> 3 -> 5 -> 4.*/
