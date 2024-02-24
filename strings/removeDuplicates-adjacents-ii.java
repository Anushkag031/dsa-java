class Solution {
    public String removeDuplicates(String s, int k) {
        
        Stack<Character> stack=new Stack<>(); //to store char
        Stack<Integer> count=new Stack<>(); //to store freq

        for(char c: s.toCharArray())
        {
            
            if(!stack.isEmpty() && stack.peek()==c) 
            {
                //if already in the stack
                count.push(count.peek()+1); //increase count by 1
            }
            else
            //if not
            count.push(1);

            stack.push(c);


            //keep popping k elements
            if(count.peek()==k)
            {
                for(int i=0; i<k; i++)
                {
                    stack.pop();
                    count.pop();
                }
            }
        }
        /*StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        return sb.reverse().toString(); */

        String ans=new String("");
        while(!stack.isEmpty()){
            ans=stack.pop() + ans;
        }
        return ans;
    }
}
