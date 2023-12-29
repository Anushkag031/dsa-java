class Solution
{
	ArrayList <Integer> boundary(Node root)
	{
	    
	    ArrayList<Integer> res=new ArrayList<>();
	    if(root==null) return res;
	    res.add(root.data);
	    if(isLeaf(root)) return res;
	    
	    addLeftNodes(root.left,res);
	    addLeaves(root,res);
	    addRightNodes(root.right, res);
	    
	    return res;
	    
	}
	boolean isLeaf(Node root)
	{
	    return root.left==null && root.right==null;
	}
	void addLeftNodes(Node root, ArrayList<Integer> res)
	{
	    Node cur=root;
	    while(cur!=null)
	    {
	        if(!isLeaf(cur))
	        res.add(cur.data);
	        if(cur.left!=null)
	        cur=cur.left;
	        else
	        cur=cur.right;
	    }
	}
	void addLeaves(Node root, ArrayList<Integer> res)
	{
	    if(isLeaf(root)){
	    res.add(root.data);
	    
	    return;
	    }
	    
	    if(root.left!=null) addLeaves(root.left,res);
	    
	    if(root.right!=null) addLeaves(root.right,res);
	    
	}
	void addRightNodes(Node root, ArrayList<Integer> res)
	{
	    Node cur=root;
	    ArrayList<Integer> temp=new ArrayList<>();
	    while(cur!=null)
	    {
	        if(!isLeaf(cur))
	        temp.add(cur.data);
	        if(cur.right!=null)
	        cur=cur.right;
	        else
	        cur=cur.left;
	    }
	    Collections.reverse(temp);
	    for(int i : temp)
	    res.add(i);
	}
}
