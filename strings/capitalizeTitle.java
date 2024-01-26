class Solution {
    public String capitalizeTitle(String title) {
        title=title.toLowerCase();

        String arr[]=title.split(" ");
        StringBuilder sb=new StringBuilder();

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i].length()<3)
            {
                sb.append(arr[i] + " ");
            }

            else {
                char ch=arr[i].charAt(0);
                ch=Character.toUpperCase(ch);
                String word=ch + arr[i].substring(1);
                sb.append(word+" ");
            }
        }
        String res=sb.toString().trim();
        return res ;

    }
}
