class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        
        if(root.val==val) return root;
        else if(root.val>val) return searchBST(root.left,val);
        else return searchBST(root.right,val);
        
        //return null;
    }
}
/*

        while(root!=null) {
            if(root.val==val) {
                break;
            } else if(root.val<val) {
                root=root.right;
            } else {
                root=root.left;
            }
        }
        return root;
    
 */
