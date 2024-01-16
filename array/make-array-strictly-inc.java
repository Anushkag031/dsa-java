class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int left=0;
        int right=0;

        int n=nums.length;

        int last=nums[n-1];

        for(int i=n-2; i>=0; i--)
        {
            if(nums[i]<last)
            last=nums[i];
            else right++;
        }
        last=nums[0];
        for(int i=1; i<n; i++)
        {
            if(nums[i]>last)
            last=nums[i];
            else left++;
        }
        return Math.min(left,right)<=1;
    }
}
