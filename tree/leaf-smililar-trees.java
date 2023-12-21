class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       if(root1==null  && root2==null) return true;
       if(root1==null || root2==null) return false;
       

        ArrayList<Integer> l1=new ArrayList<Integer>();
        ArrayList<Integer> l2=new ArrayList<Integer>();

        
        ans(root1,l1);
        ans(root2,l2);


        if(l1.equals(l2)) return true;
        return false;

    }
    private void ans(TreeNode root, List<Integer> list)
    {
        if(root==null) return;
        if(root.left==null && root.right==null) 
        list.add(root.val);

        ans(root.left,list);
        ans(root.right,list);
    }
}
