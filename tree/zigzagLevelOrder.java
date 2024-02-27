class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {  

        Queue<TreeNode> q= new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();

        if(root==null)
        return ans;

        q.offer(root);

        boolean level=true;

        while(!q.isEmpty())
        {
            int size=q.size(); //level size
            ArrayList<Integer> al=new ArrayList<>(size);
            for(int i=0; i<size; i++)
            {
                TreeNode temp=q.peek();
                q.poll();
                if(level)
                {
                    al.add(temp.val); //adding at last
                }
                else
                    al.add(0,temp.val); //adding at begining

                if(temp.left!=null)
                q.offer(temp.left);

                if(temp.right!=null)
                q.offer(temp.right);
            }
            level=!level;
            ans.add(al);
        }
        return ans;
           
    }
}
