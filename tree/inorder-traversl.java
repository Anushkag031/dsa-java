class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> al=new ArrayList<>();
        if(root!=null)
        {
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        return al;
    }
}
