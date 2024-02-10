class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int[] vis=new int[V];
        Stack<Integer> st=new Stack<Integer>();
        
        for(int i=0; i<V; i++)
        {
            if(vis[i]==0)
            {
                dfs(i,vis,st,adj);
            }
        }
        int ans[]= new int[V];
        int i=0;
        while(!st.isEmpty())
        {
            ans[i++]=st.peek();
            st.pop();
        }
        return ans;
    }
    static void dfs(int node, int vis[], Stack<Integer> st,ArrayList<ArrayList<Integer>> adj)
    {
        vis[node]=1; //mark vis node as 1
        
        for(int i : adj.get(node))
        {
            if(vis[i]==0)
            {
                dfs(i,vis,st,adj);
            }
        }
        //when dfs is completed
        st.push(node);
    }
}
