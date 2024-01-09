class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        ArrayList<pair> al=new ArrayList<>();
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M;j++)
            {
                if(A[i]+B[j]==X)
                
                al.add( new pair(A[i],B[j]));
            }
        }
        pair[] ans=new pair[al.size()];
        al.toArray(ans);
        return ans;
    }
}
