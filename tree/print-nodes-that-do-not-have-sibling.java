class Tree
{
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        ans(node ,list);
        if(list.size()==0) list.add(-1);
        Collections.sort(list);
        return list;
        
    }
    void ans(Node node,ArrayList<Integer> list )
    {
        if(node==null) return;
        if(node.left==null && node.right!=null)
        {   
            if(!list.contains(node.right.data))
            list.add(node.right.data);
        }
        if(node.right==null && node.left!=null)
        {   
            if(!list.contains(node.left.data))
            list.add(node.left.data);
        }
        ans(node.left,list);
        ans(node.right,list);
    }
}
