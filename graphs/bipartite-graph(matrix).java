class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] vis=new int[n];

        for(int i=0; i<n; i++) vis[i]=-1;

        for(int i=0; i<n; i++)
        {
            if(vis[i]==-1)
            {
                if(dfs(i,0,vis,graph)==false)
                return false;
            }
        }
        return true;
    }
    private boolean dfs(int node, int colour, int[] vis, int[][] graph)
    {
        vis[node]=colour;

        for(int i : graph[node] )
        {
            if(vis[i]==-1)
            {
                if(dfs(i,1-colour,vis,graph)==false)
                return false;
            }
            else if(vis[i]==colour)
                return false;  
        }
        return true;
    }
}
