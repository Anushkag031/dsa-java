class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int source=grid[0][0];
       // int dest=grid[n][m];

       if(source==1) return -1;

        boolean vis[][]=new boolean[n][m];

        Queue<Pair> q = new ArrayDeque<>();  // or we can use LinkedList
        q.add(new Pair(0,0,1));
        vis[0][0]=true;

        int dr[]={-1,1,0,0,-1,-1,1,1};
        int dc[]={0,0,1,-1,-1,1,-1,1};

        while(!q.isEmpty())
        {
            int row=q.peek().row;
            int col=q.peek().col;
            int len=q.peek().len;
            q.remove();

            for(int i=0; i<8; i++)
            {
                int newr=dr[i]+row;
                int newc=dc[i]+col;

                if(isValid(newr,newc,vis,grid))
                {
                    q.add(new Pair(newr,newc,len+1));
                    vis[newr][newc]=true;
                }
                if(newr==n && newc==m) return len;
            }
        }
        return -1;
    }
    boolean isValid(int newr, int newc, boolean [][]vis, int grid[][])
    {
        //vis[newr][newc]=true;
        if(newr>=0 && newc >=0 && newr <grid.length && newc <grid[0].length
        && !vis[newr][newc] && grid[newr][newc]==0) return true;
        else return false;
    }
    
}
class Pair{
        int row;
        int col;
        int len;
        Pair(int row,int col,int len)
        {
            this.row=row;
            this.col=col;
            this.len=len;
        }
    }
