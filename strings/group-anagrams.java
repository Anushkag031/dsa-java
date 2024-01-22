class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //List<List<String>> al=new ArrayList<>();

        if(strs==null||strs.length==0) 
        return null;

        Map<String, List<String>> hm=new HashMap<>();

        for(String s : strs)
        {
            //String freq=getFreq(s);
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String str=new String(arr);

            if(hm.containsKey(str))
            {
                hm.get(str).add(s);
            }
            else
            {
                List<String> al=new ArrayList<>();
                al.add(s);
                hm.put(str,al);
            }
        }
        return new ArrayList<>(hm.values());
    }
    
}
