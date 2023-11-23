class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> val=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null)
        {
             val.add(curr.val);
             curr=curr.next;
        }

        int ans[]=new int[val.size()];
        Stack<Integer> stack=new Stack<>();

        for(int i=0; i<val.size(); i++)
        {
           // While the stack is not empty and the current element is greater than the element at the top of the stack
            while (!stack.isEmpty() && val.get(stack.peek()) < val.get(i)) {
                // Update the result array at the index stored in the stack with the current element
                ans[stack.pop()] = val.get(i);
            }
            // Push the current index onto the stack
            stack.push(i);
        }
        return ans;
        
    }
}
