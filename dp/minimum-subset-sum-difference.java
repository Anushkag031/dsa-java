class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int range=0;
	    for(int i=0; i<n; i++)
	    {
	        range+=arr[i];
	    }
	    
	    int dp[][]=new int[n+1][range+1];
	    
	    for(int i=0; i<n+1; i++)
	    {
	        for(int j=0; j<range+1; j++)
	        {
	            if(i==0)
	            dp[i][j]=0;
	            if(j==0)
	            dp[i][j]=1;
	        }
	    }
	    for(int i=1; i<n+1; i++)
	    {
	        for(int j=1; j<range+1; j++)
	        {
	            if(arr[i-1]<=j)
	            dp[i][j]=Math.max(dp[i-1][j-arr[i-1]],dp[i-1][j]);
	            else
	            dp[i][j]=dp[i-1][j];
	        }
	    }
	    int s[]=new int[range/2+1];
	    for(int i=0; i<range/2+1; i++)
	    {
	        if(dp[n][i]!=0)
	        s[i]=i;
	    }
	    int mn=Integer.MAX_VALUE;
	    for(int i=0; i<s.length; i++)
	    {
	        mn=Math.min(mn,range-2*s[i]);
	        
	    }
	    return mn;
	} 
}
