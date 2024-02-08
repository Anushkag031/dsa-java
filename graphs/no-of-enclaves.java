class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1 && (i == 0 || j == 0 || i == m-1 || j == n-1) ){
                     dfs(grid, i, j);
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 'T') grid[i][j] = 1;
                else if(grid[i][j] == 1) {
                grid[i][j] = 0;
                count++;
                }
            }
        }
        return count;
    }
    
public void dfs(int[][] grid, int i, int j){
        if(i<0 || j<0 || i>= grid.length || j>=grid[0].length || grid[i][j] != 1) return;
        
        grid[i][j] = 'T'; // to put a temperory mark/ to mark as visited
        
        dfs(grid, i, j+1); // Top
        dfs(grid, i, j-1); // Bottom
        dfs(grid, i+1, j); // Right
        dfs(grid, i-1, j); // Left
    }
}
  
