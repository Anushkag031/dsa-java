class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();

        int open=0, close=0;
        helper(ans,n,open,close,"");
        return ans;
    }
    void helper(ArrayList<String> ans, int n, int open, int close, String s)
    {
        if(open==n && close ==n)
        {
            ans.add(s);
            return;
        }
        //we can add in two ways
        //1. 
        if(open < n)
        helper( ans, n, open +1, close, s+"(");
        //2.
        if(close < open)
        helper(ans, n, open, close +1, s+")");

    }
}
