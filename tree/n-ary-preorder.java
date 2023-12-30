class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        
        //add root
        list.add(root.val);

        for(Node child:root.children)
        {
            //add all the childs in childList
            List<Integer> childList=preorder(child);
            
            //addinf all the child in parents list
            for(int x : childList)
            list.add(x);                       
        }
            
        return list;
        
    }
}
