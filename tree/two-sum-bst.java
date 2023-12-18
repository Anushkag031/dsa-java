class Solution {
    
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> li=new ArrayList<Integer>();
        if(root==null) return false;
        Inorder(root,li);
        int i=0;
        int j=li.size()-1;
        while(j>i)
        {
            int sum=li.get(i)+li.get(j);
            if(sum==k) return true;
            else if(sum<k) i++;
            else j--;
        }
        return false;
    }
    public static void Inorder(TreeNode root, List<Integer> li)
    {
        if(root==null) return;
        Inorder(root.left,li);
        li.add(root.val);
        Inorder(root.right,li);
        
    }
}
