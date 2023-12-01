class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       ArrayList<Integer> al=new ArrayList<>();
        if(root!=null)
        {
            postOrder(root.left);
            
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        return al;
    }
}
