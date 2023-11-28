class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head ==null)
        return true;
        ListNode mid= middle(head);
        ListNode last= reverse(mid.next);
        mid.next=null;
        ListNode cur = head;
        
//comparion or palindrome check
        while(last!=null){
        if(last.val!= cur.val) return false;                       
            last = last.next;
            cur = cur.next;            
        }  
        return true;      
    }
//middle elememt
    ListNode middle(ListNode head){
            ListNode slow= head;
            ListNode fast=head;
            while(fast.next!=null && fast.next.next !=null){
                slow = slow.next;
                fast= fast.next.next;
            }
            return slow;
        }
        // reverse the second half
    ListNode reverse(ListNode head){
            ListNode cur =head;
            ListNode prev=null;
            while(cur!=null){
                ListNode temp=cur.next;
                cur.next=prev;
                prev=cur;
                cur=temp;

            }
            return prev;
        }
}
