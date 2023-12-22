class Solution {
    public boolean isCousins(TreeNode root, int a, int b) {
        if(root==null) return false;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
       
        while(!q.isEmpty())
        {
            int n=q.size();
             int count=0;
            for(int i=0 ; i< n; i++)
            {
                TreeNode cur= q.poll(); //popping the node from queue
                
                if(cur.left!=null && cur.right!=null)
                {
                    if(cur.left.val==a && cur.right.val==b)
                    return false;

                    if(cur.right.val==a && cur.left.val==b)
                    return false;
                }
                if(cur.left !=null)
                q.offer(cur.left);

                if(cur.right!=null)
                q.offer(cur.right);
                
                if(cur.left!=null && (cur.left.val==a || cur.left.val==b)){
                    count++;
                }
                
                if(cur.right!=null && (cur.right.val==a || cur.right.val==b)){
                   count++;
                }                
            }
            if(count==2) 
                return true;
        }
        return false;
    }
}
/*class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty())
        {
           
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=0 ; i< q.size(); i++)
            {
                TreeNode cur= q.poll(); //popping the node from queue
                
                if(cur.left!=null && cur.right!=null)
                {
                    if(cur.left.val==x && cur.right.val==y)
                    return false;

                    if(cur.right.val==x && cur.left.val==y)
                    return false;
                }
                al.add(cur.val);
                if(cur.left !=null)
                q.offer(cur.left);

                if(cur.right!=null)
                q.offer(cur.right);
                
            }  
            if(al.contains(x)&& al.contains(y))    
            return true;
        }
        return false;
    }
}*/
/*class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(q.size() > 0)
        {
            boolean isX= false;
            boolean isY= false;
            int n=q.size();
            for(int i=0 ; i< n; i++)
            {
                TreeNode cur= q.poll(); //popping the node from queue
                if(cur.val==x) isX= true;
                if(cur.val==y) isY= true;

                if(cur.left!=null && cur.right!=null)
                {
                    if(cur.left.val==x && cur.right.val==y)
                    return false;

                    if(cur.left.val==y && cur.right.val==x)
                    return false;
                }
                if(cur.left !=null)
                q.offer(cur.left);

                if(cur.right!=null)
                q.offer(cur.right);

            }
            if(isX==true && isY==true) return true;

        }
        return false;
    }
}*/
