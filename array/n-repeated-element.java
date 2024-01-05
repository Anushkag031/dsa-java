class Solution {
    public int repeatedNTimes(int[] nums) {
        /*Arrays.sort(nums);
        ArrayList<Integer> list=new ArrayList();
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]==nums[i-1])
            
            list.add(nums[i]);
        }
       
        return list.get(0); */
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            if(set.contains(num)) 
            return num;
            else set.add(num);
        }
        return -1;
    }
}
