class Solution {
    public int arrayPairSum(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        //int n=nums.length;

        /*for(int i=0; i<nums.length; i+=2)
        {
            sum+=nums[i];
        }*/

        for(int i=1; i<nums.length; i+=2)
        {
            sum+=Math.min(nums[i],nums[i-1]);
        }
        return sum;
    }
}
