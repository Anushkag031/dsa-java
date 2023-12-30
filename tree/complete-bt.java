class Solution {
    public boolean isCompleteTree(TreeNode root) {
        boolean flag=false;
          
          Queue<TreeNode> q=new LinkedList<>();
          q.offer(root);
          
          while(!q.isEmpty())
          {
              int n=q.size();
              for(int i=0; i<n; i++)
              {
                  TreeNode curr=q.poll();
              if(curr==null) flag=true;
              else
              {
                  if(flag) return false;
                  q.offer(curr.left);
                  q.offer(curr.right);
              }
              }
          }
          return true;
    }
}
