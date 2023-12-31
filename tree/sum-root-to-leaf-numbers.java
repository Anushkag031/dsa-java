class Solution {
    int totalSum=0;
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        totalSum=0;
        ans(root,0);
        return totalSum;
    }
    void ans(TreeNode root, int sum)
    {
        if(root==null) return;

        sum=sum*10+root.val;
        ans(root.left,sum);
        ans(root.right,sum);

        if(root.left==null&&root.right==null)
        {
            totalSum+=sum;
            return;
        }


    }
}
