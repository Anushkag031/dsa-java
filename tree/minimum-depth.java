class Solution
{
	int minDepth(Node root)
	{
	    //code here
	    if(root==null) return 0;
	    if(root.left == null && root.right == null) return 1;
        int lh=minDepth(root.left);
	    int rh=minDepth(root.right);
	    //if(root.left == null || root.right == null){
        //    return 1+Math.max(lh, rh);
        //}
        if(root.left==null) return 1+rh;
        if(root.right==null) return 1+lh;
        
	    return 1+ Math.min(lh,rh);
	    
	}
}

