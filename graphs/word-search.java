class Solution {
    public boolean exist(char[][] board, String word) {

        for(int i=0; i<board.length; i++)
        {
            for( int j=0; j<board[0].length; j++)
            {
                if(board[i][j]==word.charAt(0) && dfs(i,j,0,board,word))
                return true;
            }
        }
        return false;
    }
    private boolean dfs(int i , int j, int count, char[][] board, String word)
    {
        if(count==word.length()) return true;
        if(i==-1 || j==-1 || i==board.length || j==board[0].length || board[i][j]!=word.charAt(count))
        return false;

        char temp=board[i][j]; //if found
        board[i][j] = '#';

        boolean found = dfs(i + 1, j, count + 1, board, word) ||
            dfs(i, j + 1, count + 1, board, word) ||
            dfs(i - 1, j, count + 1, board, word) ||
            dfs(i, j - 1, count + 1, board, word);


        board[i][j]=temp;

        return found;
    }
}
