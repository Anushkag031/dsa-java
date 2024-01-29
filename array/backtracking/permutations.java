class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(ans, new ArrayList(), nums);
        return ans;

    }
    void helper(List<List<Integer>> ans, ArrayList<Integer> temp, int[] nums)
    {
        //stop
        if(nums.length==temp.size())
        {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for( int n : nums)
        {
            if(temp.contains(n)) //for no duplicate num
            continue; //skip

            temp.add(n);
            helper(ans,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}
