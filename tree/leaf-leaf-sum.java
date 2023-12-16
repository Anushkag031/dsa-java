class Solution{

    public int leftLeavesSum(Node root) 
    { 
        // Write your code here
        int sum=0;
        if(root==null) return 0;
        if(root.left!=null && root.left.left==null && root.left.right==null)
        {
            sum+=root.left.data;
            return sum + leftLeavesSum(root.right);
        }
        return leftLeavesSum(root.left)+leftLeavesSum(root.right);
        
        
        
    } 

}
