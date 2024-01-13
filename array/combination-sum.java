class Solution {
    List<List<Integer>> ans=new ArrayList<>();

    void helper(int[] candidates, int target, int i, int cursum,List<Integer> temp)
    {

        if(cursum>target) return;

        if(i==candidates.length)
        {
            if(cursum==target)
            {
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        cursum+=candidates[i];
        temp.add(candidates[i]);

        helper(candidates, target, i, cursum, temp);

        cursum-=candidates[i];
        temp.remove(temp.size()-1);
        helper(candidates, target, i+1, cursum, temp);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp=new ArrayList<>();

        helper(candidates, target, 0,0,temp);
        return ans;
    }
}
