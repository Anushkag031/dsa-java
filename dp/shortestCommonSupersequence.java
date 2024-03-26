class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        //Your code here
        
        int total=m+n;
        int ans =total - longestCommonSubsequence(String a, String b , int x, int y);

        return ans;
        
    }
    public static int longestCommonSubsequence(String text1, String text2, int x, int y) {
        
        int dp[][]=new int[x+1][y+1];

        for(int i=1; i<x+1; i++)
        {
            for(int j=1; j<y+1; j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                dp[i][j]=dp[i-1][j-1] +1;
                else
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[x][y];
    }
    
    
}
