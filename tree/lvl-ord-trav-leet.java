class Solution {
    public List<List<Integer>> levelOrder(TreeNode node) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<>();
        if(node == null) return ans;
        q.add(node);
       
         while (!q.isEmpty()) {
            int n = q.size();  
            List<Integer> list = new ArrayList<>();
            
            for (int i = 0; i < n; i++) 
            {
                TreeNode curr = q.poll();
                list.add(curr.val);
                
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            
            ans.add(list); 
        }
        return ans;
         /*while(q.size()>0)
        {
            TreeNode curr=q.poll();
            //System.out.print(curr.val+" ");
            ans.add(curr.val);
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
        
        */
        
        
    }
}
