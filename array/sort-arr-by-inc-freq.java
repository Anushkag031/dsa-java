class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();

        ArrayList<Integer> ans=new ArrayList<>();

        for(int num : nums)
        {
            ans.add(num);
            map.put(num,map.getOrDefault(num,0)+1);
        }

        Collections.sort(ans,(a,b) -> 
        map.get(a)==map.get(b) ? b-a : map.get(a)-map.get(b));

        for(int i=0; i<ans.size(); i++)
        {
            nums[i]=ans.get(i);
        }
        return nums;
    }
}
