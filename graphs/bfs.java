class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[]=new boolean[V];
        ArrayList<Integer> ans=new ArrayList<>();
        vis[0]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        
        while(!q.isEmpty())
        {
            Integer node=q.poll();
            ans.add(node);
            
            for(Integer i : adj.get(node))
            {
                if(vis[i]==false)
                {
                    vis[i]=true;
                    q.add(i);
                }
            }
        }
        return ans;
        
    }
}
