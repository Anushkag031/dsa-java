class Solution {
    public String largestNumber(int[] nums) {
       String[] str=new String[nums.length];

       for(int i=0; i<nums.length; i++)
       {
           str[i]=String.valueOf(nums[i]);
       } 
       //returns in des order
       Arrays.sort(str,(a,b) -> (b+a).compareTo(a+b)); 

       StringBuilder sb=new StringBuilder();
       for(String s : str)
       {
           sb.append(s);
       }

       String res=sb.toString();
       if(res.startsWith("0"))
       return "0";
       else return res;
    }
}
