class Solution {
    public int findCenter(int[][] edges) {

        //the common node in the first two edges will be the center node
        
        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) 
		return edges[0][0];
        else 
		return edges[0][1];

    }
}
