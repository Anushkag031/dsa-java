class Solution {
    public List<Integer> largestValues(TreeNode root) {

        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();

        if(root==null) return ans;

        q.add(root);

        while(!q.isEmpty())
        {
            int size=q.size();

            int maxVal=Integer.MIN_VALUE;

            for(int i=0; i<size; i++)
            {
                TreeNode curr=q.poll();
                
                maxVal=Math.max(curr.val,maxVal);
                
                if(curr.left!=null)
                q.add(curr.left);

                if(curr.right!=null)
                q.add(curr.right);
            }
            ans.add(maxVal);
            
        }        
        return ans;
    }
}
