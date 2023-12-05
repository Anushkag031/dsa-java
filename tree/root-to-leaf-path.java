class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        if(root!=null) dfs(root,"",res);
        return res;
    }
    public void dfs(TreeNode root, String path, List<String> res)
    {
        //path=path+root.val+"->";
        if(root.left==null&&root.right==null) 
         res.add(path+root.val);
        if(root.left!=null)
         dfs(root.left,path+root.val+"->",res);
        if(root.right!=null)
         dfs(root.right,path+root.val+"->",res);

    }
}
