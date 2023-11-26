class Solution {
    public void flatten(TreeNode root) {
        if(root==null|| (root.right==null && root.left==null)) return;
        //falttening the left subtree
        if(root.left!=null)
        {
        flatten(root.left);

        TreeNode temp=root.right; //storing right in temp;
        root.right=root.left;//making left as right subtree
        root.left=null; //left as null

        //finding the tail of subtree
        TreeNode tail=root.right; //previously left
        while(tail.right!=null)
        {
            tail=tail.right;
        }
        //connecting the right subtree to the left subtree
        tail.right=temp; 
        }  
        flatten(root.right);     
    }
    
}
