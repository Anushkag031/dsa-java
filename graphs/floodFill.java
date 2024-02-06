class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialColor=image[sr][sc];
        dfs(image,sr,sc,color,initialColor);
        return image;
    }
    public void dfs(int image[][],int sr,int sc,int color,int initialColor)
    {
       
        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length) return ;
        
        if(image[sr][sc] != initialColor || image[sr][sc] == color) return ;
        
        image[sr][sc] = color;
       
        dfs(image,sr+1,sc,color,initialColor);//bottom
        dfs(image,sr-1,sc,color,initialColor);//top
        dfs(image,sr,sc+1,color,initialColor);//right
        dfs(image,sr,sc-1,color,initialColor);//left
    }
}
