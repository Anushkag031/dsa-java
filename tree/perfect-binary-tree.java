class Solution{
    public boolean isPerfect(Node root){
        //code here
        if(root==null) return true;
        
        if(root.left==null && root.right==null) return true;
        if(root.left==null || root.right==null) return false;
        
        
        if((root.left.left!=null && root.right.right==null)||(root.left.left==null && root.right.right!=null))
        return false;
        
        if(root.left!=null && root.right!=null) 
         return isPerfect(root.left) && isPerfect(root.right);
        return false;
    }
}


/* another method :

    find maxheight and minheight
    if maxheight==minheight
    or
    maxheight-minheight==0
    
    then it is a perfect binary tree. */
