class Solution
{
	public static int countPairs(Node root1, Node root2, int x)
	{
		// Code here
		HashSet<Integer> a=new HashSet<>();
		HashSet<Integer> b= new HashSet<>();
		
		inorder(root1,a);
		inorder(root2,b);
		
		int count=0;
		for(int i:a)
		{
		    if(b.contains(x-i)) count++;
		}
		return count;
	}
	public static void inorder(Node root,HashSet<Integer> arr )
	{
	    if(root==null) return ;
	    
	    inorder(root.left,arr);
	    arr.add(root.data);
	    inorder(root.right,arr);
	}
}
