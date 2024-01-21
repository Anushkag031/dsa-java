class Solution {
    String removeDups(String S) {
        // code here
        HashSet<Character> set=new HashSet<>();
        
        StringBuilder res=new StringBuilder();
        
        for(char ch : S.toCharArray())
        {
            if(set.add(ch))
            res.append(ch);
        }
        return res.toString();
    }
}
