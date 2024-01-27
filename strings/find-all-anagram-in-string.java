class Solution {
    public List<Integer> findAnagrams(String s, String p) {

       List<Integer> al= new ArrayList<Integer>();

       if(p.length() > s.length()) return al;

       int n = s.length();
       int m = p.length();

       int[] count =  freq(p);
       int[] curr= freq(s.substring(0,m));

       if(areSame(count,curr))
       al.add(0);

       for(int i=m; i<n; i++)
       {
           //moving window foward
           curr[s.charAt(i-m)-'a']--;
           curr[s.charAt(i)-'a']++;

           if(areSame(count,curr))
           {
               al.add(i-m+1);
           }
       }
       return al;
    }


    private boolean areSame(int[] x, int[]y)
    {
        for(int i=0; i<26; i++)
        {
            if(x[i] != y[i])
            return false;
        }
        return true;
    }
    //storing the freq of given string
    private int[] freq(String s)
    {
        int[] count=new int[26];
        for(int i=0; i<s.length(); i++)
        {
            count[s.charAt(i)-'a']++;
        }
        return count;
    }
}
