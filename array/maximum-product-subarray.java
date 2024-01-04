class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1;
        int suffix=1;
        int max=Integer.MIN_VALUE;

        int n=nums.length;

        for(int i=0; i<nums.length; i++)
        {            
            //when get 0, update prefix,suffix again =1
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            //left to right product
            prefix=prefix*nums[i];
            //right to left product
            suffix=suffix*nums[n-i-1];

            max=Math.max(max,Math.max(prefix,suffix));
        }
        return max;
        
    }
}
