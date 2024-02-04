class Solution {
    public int findCircleNum(int[][]isConnected) {
        
        // code here
        int V=isConnected.length;
       
        int vis[]=new int[V];
        int count=0;
        for(int i=0; i<V; i++)
        {
            if(vis[i]==0)
            {
                count++;
                dfs(i,isConnected,vis);
                
            }
        }
        return count;
        
    }
    void dfs(int i, int[][] adj, int vis[])
    {
        vis[i]=1;
        for(int j=0; j<adj.length; j++)
        {
            if(adj[i][j]==1 && i!=j)
            if(vis[j]==0)
            {
                dfs(j,adj,vis);
            }
        }
    }
};
 
