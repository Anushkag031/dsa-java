class Solution {
    public int countPrimes(int n) {
        boolean[] visited=new boolean[n];
        Arrays.fill(visited,true);

        for(int i=2; i*i<n; i++)
        {
            if(visited[i])
            {
                for(int j=i*i; j<n; j+=i)
                {
                    visited[j]=false;
                }
            }
        }
        int ans=0;
        for(int i=2; i<n; i++)
        {
            if(visited[i])
            ans++;
        }
        return ans;
    }
}
