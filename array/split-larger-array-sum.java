class Solution {

    public int splitArray(int[] nums, int k) {
        int low=0; 
        int high=0;

        for(int i=0; i<nums.length; i++)
        {
            low=Math.max(low,nums[i]); //maximum ele
            high+=nums[i]; // total sum
        }

        int ans=0; 

        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int count=countSubarrays(nums,mid);

            if(count<=k)
            {
                high=mid-1;
                //ans=mid;
            }
            else {
                low=mid+1;
            }
        }
        return low;        
    }
    public int countSubarrays(int[]nums, int mid)
    {
        int count=1;
        int sum=0;

        for(int i=0; i<nums.length; i++)
        {
            if(sum+nums[i]<=mid){
            sum+=nums[i];
            }
            else
            {
                 count++;
                 sum=nums[i];
            }   
        }
        return count;
    }
}
