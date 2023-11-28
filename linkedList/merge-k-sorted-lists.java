class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((x,y)-> x.val-y.val);
        ListNode res=new ListNode(0);
        ListNode p=res;
        //adding only head of lists to the pq
        for(int i=0; i<lists.length;i++)
        {
            if(lists[i]!=null)
            {
                pq.offer(lists[i]); //first ele of each list
            }
        }
        //add the next ele of head(ele to be popped)
        while(!pq.isEmpty())
        {
            ListNode node=pq.poll(); //adding it to ll, remove from pq
            if(node.next!=null)//next ele
            {
                pq.offer(node.next);                
            }
            p.next=node;
            p=p.next;
        }
        return res.next;//head
    }
}
