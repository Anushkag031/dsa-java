class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans=new ArrayList<>();
         
        int V=graph.length;

        int[] vis=new int[V];
        
        for(int i=0; i<V; i++) 
        {
            if(dfs(i, graph, vis)) 
            ans.add(i);
        }
        
        Collections.sort(ans);
        return ans;
    }
    private boolean dfs(int node, int[][] graph, int[] vis) 
    {
        if(vis[node]!=0) 
        return vis[node]==2;
        
        vis[node]=1;
        
        for(int i : graph[node]) 
        {
            if(!dfs(i, graph, vis)) return false;
        }
        vis[node]=2;
        return true;
    }
}
