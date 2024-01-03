class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> ng=new HashMap<>();
        Stack<Integer> st=new Stack<>();
//push each ele in num2 in stck
//each ans compare with top of stack
//if greater ele is found, update the HM
        for(int i : nums2)
        {
            while(!st.isEmpty() && st.peek() < i)
            {
                ng.put(st.pop(), i);
            }
            st.push(i);
        }
        //update the ans array
        for(int i=0; i<nums1.length; i++)
        {
            nums1[i]=ng.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}
