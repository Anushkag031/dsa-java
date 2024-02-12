class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length;
        int source=0;
        int dest=n-1;

        List<List<Integer>> ans=new ArrayList<>();

        List<Integer> curr=new ArrayList<>();
        curr.add(0);

        dfs(source,dest,curr,ans,graph);
        return ans;
    }
    public void dfs(int source, int dest, List<Integer> curr, List<List<Integer>> ans, int[][] graph)
    {
        int n=graph.length;
         //source=0;
         dest=n-1;
        if(source==dest)
        {
            ans.add(new ArrayList(curr));
            return;
        }
        for(int i : graph[source])
        {
            curr.add(i);
            dfs(i,n-1,curr,ans,graph);
            curr.remove(curr.size()-1);
        }
    }
}
