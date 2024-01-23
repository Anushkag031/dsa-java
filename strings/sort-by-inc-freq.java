class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hm=new HashMap<>();

        for(char c: s.toCharArray())
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        List<Character>[] arr=new List[s.length()+1];

        for(Character key : hm.keySet() )
        {
            int freq=hm.get(key);
            if(arr[freq]==null)
            {
                arr[freq]=new ArrayList<>();
            }
            arr[freq].add(key);
        }

        StringBuilder sb=new StringBuilder();

        for(int i=arr.length-1; i>=0; i--)
        {
            if(arr[i]!=null)
            {
                for(char c : arr[i])
                {
                    for(int j=0; j<i; j++)
                    {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}
