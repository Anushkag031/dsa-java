class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        
        

        for(Node child:root.children)
        {
            //add all the childs in childList
            List<Integer> childList=postorder(child);
            
            //addinf all the child in parents list
            for(int x : childList)
            list.add(x);                       
        }
            //add root
        list.add(root.val);
        return list;
        
    }
}
