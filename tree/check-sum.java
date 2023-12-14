class Solution {
    public boolean checkTree(TreeNode root) {
        if(root==null) return false;
        if(root!=null)
        {
            int sum=0;
            sum=root.left.val+root.right.val;
            if(root.val==sum)
            return true;
        }
        return false;
        
      
    }
}
//  return root.val==root.left.val+root.right.val;
