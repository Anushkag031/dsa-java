class Solution
{
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
    public List<Integer> merge(Node root1,Node root2)
    {
        // Write your code here
        ArrayList<Integer> al=new ArrayList<>();
        if(root1==null && root2==null) return al;
        
        ans(root1,al);
        ans(root2,al);
        
        Collections.sort(al);
        return al;
    }
    public void ans(Node root, ArrayList<Integer> al)
    {
        if(root==null) return;
        if(root!=null)
        {
            al.add(root.data);
            ans(root.left,al);
            ans(root.right,al);
        }
    }
}
