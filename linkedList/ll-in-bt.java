class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root==null) return false;
        if(head==null) return true;

        return dfs(head,root) ||isSubPath(head,root.left) || isSubPath(head,root.right);
    }
    public boolean dfs(ListNode head, TreeNode root)
    {
        if(head == null) return true;
        if(root == null) return false;
        return (root.val==head.val) && (dfs(head.next, root.left) || dfs(head.next,root.right));
    }
}
