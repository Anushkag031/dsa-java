class Solution{
    int longestCommonSubstr(String S1, String S2, int n, int m){
        // code here
        int dp[][]=new int[n+1][m+1];
        int result = 0;

        for(int i=0; i<n+1; i++)
        {
            for(int j=0; j<m+1; j++)
            {
                if(i==0 || j==0)
                dp[i][j]=0;
                else if(S1.charAt(i-1)==S2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1] +1;
                    result=Math.max(result,dp[i][j]);
                }
                else
                dp[i][j]=0;
            }
        }
        return result;
    }
}
