class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        if(root==null) return null;
        ArrayList<Double> al= new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();

      //  if(root==null) return al;

        q.offer(root);

        while(q.size()>0)
        {
            int n=q.size(); 
            double sum=0.0;
           
            for(int i=0; i<n; i++)
            {
                TreeNode curr=q.poll();

                sum+=curr.val;

                if(curr.left!=null)
                q.offer(curr.left);
                if(curr.right!=null)
                q.offer(curr.right);

            }
            //double average=(sum/n);
            al.add(sum/n);
        }
        return al;
    }
}
