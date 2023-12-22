class Solution {
    /*you are required to complete this function */
    
    boolean hasPathSum(Node root, int S ) {
        // Your code here
        return ans(root, S, 0);
    }
    boolean ans(Node root, int S, int sum){
        if(root==null) return false;
        
        sum=sum+root.data;
        if(root.left==null && root.right==null && sum==S ) 
        return true;
        
        return ans(root.left, S, sum) || ans(root.right,S,sum);
        
        
    }
}
