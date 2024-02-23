class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for( int curr : nums)
        {
            if(i==0 || i==1 || nums[i-2]!=curr)
            {
                nums[i]=curr;
                i+=1;
            }
        }
        return i;
    }
}
