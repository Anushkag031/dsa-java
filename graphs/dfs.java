class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[V];
        vis[0]=true;
        ArrayList<Integer> ans=new ArrayList<>();
        //ans.add()
        dfs(0,vis, adj, ans);
        return ans;
    }
    public static void dfs( int node,boolean vis[], ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans)
    {
        vis[node]=true;
        ans.add(node);
        
        for(Integer i : adj.get(node))
        {
            if(vis[i]==false)
            {
                vis[i]=true;
                dfs(i,vis,adj,ans);
                
            }
        }
    }
}
