class Solution{
    public static int findMax(Node root){
        //code here
        if(root==null) return 0;
        ArrayList<Integer> al=new ArrayList<>();
        
        ans(root,al);
        
        Collections.sort(al);
        Collections.reverse(al);
        return al.get(0);
    }
    public static int findMin(Node root){
        //code here
        if(root==null) return 0;
        ArrayList<Integer> al=new ArrayList<>();
        
        ans(root,al);
        Collections.sort(al);
        return al.get(0);
    }
    public static void ans(Node root, ArrayList<Integer> al)
    {
        if(root==null) return ;
        
        al.add(root.data);
        ans(root.left,al);
        ans(root.right,al);
    }
}
