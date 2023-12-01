class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
         
        ArrayList<Integer> al=new ArrayList<>();
        if(root==null) return al;
        al.add(root.data);
        al.addAll(preorder(root.left));
        al.addAll(preorder(root.right));
      return al;
      /*ArrayList<Integer> al=new ArrayList<>();
        if(root!=null)
        {
             System.out.print(root.data+" ");
            preorder(root.left);
            
            preorder(root.right);
           
        }
        return al;*/
        
    }

}
