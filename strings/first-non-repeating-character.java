class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code hereint[]
        
        int[] ans=new int[26];
        
        for(char c : S.toCharArray())
        {
            ans[c-'a']++; //count of each char
        }
        
        for(char c: S.toCharArray())
        {
            if(ans[c-'a']==1) return c; //if freq is 1 then return ans;
        }
        return '$';
        
    }
}

