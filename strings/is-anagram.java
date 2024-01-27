class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        int[] count=new int[26];
        int count2[]=new int[26];
        
        for(int i=0; i<a.length(); i++)
        {
            count[a.charAt(i)-'a']++;
            
        }
        for(int i=0; i<b.length(); i++)
        {
            count2[b.charAt(i)-'a']++;
            
        }
        if(isSame(count,count2))return true;
        else return false;
    }
    private static boolean isSame(int [] x, int []y)
    {
        for(int i=0; i<26; i++)
        {
            if(x[i] != y[i])
            return false;
        }
        return true;
    }
}
