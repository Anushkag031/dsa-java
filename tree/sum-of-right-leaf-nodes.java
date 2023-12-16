class Solution
{
    int rightLeafSum(Node root)
    {
        // code here
      
        int sum=0;
        if(root==null) return 0;
        if(root.right!=null && root.right.left==null && root.right.right==null)
        {
            sum+=root.right.data;
            return sum + rightLeafSum(root.left);
        }
        return rightLeafSum(root.left)+rightLeafSum(root.right);
        
    }
}
