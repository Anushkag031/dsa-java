class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int child=0;
        int cookie=0;

        while(child<g.length && cookie<s.length)
        {
            //if condition is true then child is satisfied
            if(s[cookie]>=g[child]) {
                child++;
                cookie++;
            } 
            else
            cookie++;
        }
        return child;
    }
}
