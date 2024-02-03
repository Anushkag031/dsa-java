class Solution {
    public int longestPalindrome(String s) {
        int[] count= new int[128];
        for(char ch : s.toCharArray()) count[ch]++;

        int res=0;
        for(int i=0; i<128; i++)
        {
            int val=count[i];
            res+=(val/2) * 2;  //even palindrome 

            if(res%2==0 && val%2==1) //odd palindrome
            res++; //inc length by 1
        }
        return res;
    }
}
/*if (s == null || s.length() == 0){
            return 0;
        }
		HashSet<Character> hs = new HashSet<Character>();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (hs.contains(s.charAt(i))) {
				hs.remove(s.charAt(i));
				count++;
			} else {
				hs.add(s.charAt(i));
			}
		}
		if (!hs.isEmpty()){
            return count * 2 + 1;
        }
		return count * 2;*/
