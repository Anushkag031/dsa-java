class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        int i[]={0};
        return ans(preorder,Integer.MAX_VALUE, i);
    }
    public TreeNode ans(int[]preorder, int bound, int i[])
    {
        if(i[0]==preorder.length || preorder[i[0]]>bound) return null;
        TreeNode root=new TreeNode (preorder[i[0]++]);
        root.left=ans(preorder,root.val,i);
        root.right=ans(preorder,bound,i);

        return root;
    }
}
