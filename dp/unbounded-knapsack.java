class Solution{
    public int cutRod(int price[], int n) {
        //code here
        
        //unbounded knapsack
        
        int length[]=new int[n];
        for(int i=0; i<n; i++)
        {
            length[i]=i+1;
        }
        
        int dp[][]=new int[n+1][n+1];
        
        for(int i=0; i<n+1; i++)
        {
            for(int j=0; j<n+1; j++ )
            {
                if(i==0 || j==0)
                dp[i][j]=0;
            }
        }
        
        for(int i=1; i<n+1; i++)
        {
            for(int j=1; j<n +1 ; j++)
            {
                if(length[i-1]<=j)
                dp[i][j]=Math.max( price[i-1] + dp[i][j-length[i-1]] , dp[i-1][j]);
                
                else
                dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][n];
    }
}
