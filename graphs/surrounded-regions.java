class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        
        //boundary check, mark # if O found on boundary
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(board[i][j] == 'O' && (i == 0 || j == 0 || i == row-1 || j == col-1) ) //boundary condition
                {
                     dfs(board, i, j);
                }
            }
        }
        
       //if any # found on boundary, mark as O
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(board[i][j] == '#') board[i][j] = 'O';
                else if(board[i][j] == 'O') board[i][j] = 'X';
            }
        }
        
    }
    
    public void dfs(char[][] board, int i, int j)
    {
        if(i<0 || j<0 || i>= board.length || j>=board[0].length || board[i][j] != 'O') return;
        
        board[i][j] = '#'; 
        
        dfs(board, i, j+1); // Top
        dfs(board, i, j-1); // Bottom
        dfs(board, i+1, j); // Right
        dfs(board, i-1, j); // Left
    }
}
