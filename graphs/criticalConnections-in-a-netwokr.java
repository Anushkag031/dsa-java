class Solution {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) 
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<n; i++)
        {
            adj.add(new ArrayList<>());
        }
        for(List<Integer> i : connections)
        {
            int u=i.get(0);
            int v=i.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int vis[]=new int[n];
        int time[]=new int[n];
        int low[]=new int[n];

        List<List<Integer>> bridges=new ArrayList<>();

        dfs(0,-1,vis,low,time,adj,bridges);
        return bridges;
    }
    private int timer=1;
    private void dfs(int node, int parent, int[] vis, int[] low, int[] time,
    ArrayList<ArrayList<Integer>> adj,List<List<Integer>> bridges)
    {
        vis[node]=1;
        low[node]=time[node]=timer;
        timer++;

        for(Integer i : adj.get(node))
        {
            if(i==parent) continue;

            if(vis[i]==0)
            {
                //node ==> parent node
                dfs(i,node,vis,low,time,adj,bridges);

                low[node]=Math.min(low[node],low[i]);

                if(low[i]>time[node]) //bridge found
                {
                    bridges.add(Arrays.asList(i,node));
                }
            }
            else
            {
                low[node]=Math.min(low[node],low[i]);
            }
        }
    }
}
