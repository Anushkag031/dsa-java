class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        Queue<Node> q=new LinkedList<>();
        if(node == null) return ans;
        q.add(node);
        while(q.size()>0)
        {
            Node curr=q.poll();
           // System.out.print(curr.data+" ");
            ans.add(curr.data);
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
        return ans;
        
    }
}
