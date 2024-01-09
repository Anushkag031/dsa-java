class Solution {
    public boolean canJump(int[] nums) {
        //greedy solution

        int reach=0;//initially at 0

        for(int i=0; i<=reach; i++)
        {
            reach=Math.max(reach,i+nums[i]); //update reach
            if(reach>=nums.length-1) return true; // if get solution
        }
        return false;
    }
}
