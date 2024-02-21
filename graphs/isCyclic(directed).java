class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        int vis[]=new int[V];
        int path[]=new int[V];
        
        for(int i=0; i<V; i++)
        {
            if(vis[i]==0)
            {
                if(dfs(i,adj,path,vis)==true)
                return true;
            }
        }
        return false;
    }
    public boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] path, int[]vis)
    {
        vis[node]=1;
        path[node]=1;
        
        for(int i : adj.get(node))
        {
            if(vis[i]==0)
            {
                if(dfs(i,adj,path,vis)==true)
                return true;
            }
            else if(path[i]==1)
            return true;
        }
        path[node]=0;
        return false;
    }
}
