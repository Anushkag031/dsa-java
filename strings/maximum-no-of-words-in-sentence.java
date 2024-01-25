class Solution {
    public int mostWordsFound(String[] sentences) {
        /*int maxCount = 0;
        
        for(int i=0;i<sentences.length;i++) 
        {
            int count = 1;
            for(int j=0;j<sentences[i].length();j++) 
            {
                if(sentences[i].charAt(j) == ' ') 
               count++;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
        */
        int maxCount = 0;
        
        for(String str : sentences) 
        {
            
            String[] ans=str.split(" "); //converting each one to string array
            
            int count=ans.length; //count the length 
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;


    }
}
