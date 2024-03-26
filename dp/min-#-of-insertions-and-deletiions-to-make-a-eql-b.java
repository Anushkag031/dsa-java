class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    // Your code goes here
	    int m=str1.length();
	    int n =str2.length();
	    return m + n - 2*lcs( str1, str2, m,n);
	} 
	public static int lcs(String text1, String text2, int x, int y) {
        int dp[][] = new int[x + 1][y + 1];

        for (int i = 1; i < x + 1; i++) {
            for (int j = 1; j < y + 1; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[x][y];
    }
}
