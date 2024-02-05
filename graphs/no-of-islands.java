class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length; 
        int m=grid[0].length;
        int count=0;

        for(int row=0; row<n ; row++)
        {
            for(int col=0; col<m; col++)
            {
                if(grid[row][col]=='1')
                {
                    count++;
                    dfs(grid,row,col);
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, int row, int col)
    {
        int n=grid.length; 
        int m=grid[0].length;

        if( row >= n|| col >= m || row < 0 || col <0 || grid[row][col] != '1') return;

        grid[row][col]='0'; //mark 0

        dfs(grid, row+1,col);
        dfs(grid,row-1,col);
        dfs(grid,row,col-1);
        dfs(grid, row, col+1);

      //for 8 directions
    }
}
