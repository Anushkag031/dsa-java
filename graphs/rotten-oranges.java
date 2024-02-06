class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        Queue<Pair> q=new LinkedList<>();

        int vis[][]=new int[n][m]; //vis grid
        int fresh=0;

        for(int row=0; row < n; row++)
        {
            for(int col=0; col < m; col++)
            {
                if(grid[row][col]==2)
                {
                    vis[row][col]=2;
                    q.add(new Pair(row,col,0));
                }
                else 
                {
                    vis[row][col]=0;
                }

                if(grid[row][col]==1) fresh ++;
            }
        }

        int time=0;

        int[] drow = {1,-1,0,0};
        int[] dcol=  {0,0,1,-1};

        int count=0;


        while(!q.isEmpty())
        {
            int ro = q.peek().row;
            int co= q.peek().col;
            int t= q.peek().tm;
            time=Math.max(t,time);

            q.remove();

            for(int i=0; i<4 ; i++)
            {
                int neiRow= ro + drow[i];
                int neiCol = co + dcol[i];


                if(neiRow >=0 && neiCol >=0 && neiRow < n && neiCol < m 
                && vis[neiRow][neiCol]==0 && grid[neiRow][neiCol]==1)
                {
                    q.add(new Pair(neiRow,neiCol,time+1));

                    vis[neiRow][neiCol]=2;
                    count++;
                }
            }
        }
        if(count!=fresh)
            return -1;

            return time;
    }  
}
class Pair{
        int row; int col; int tm;
        Pair(int row, int col, int tm)
        {
            this.row=row;
            this.col=col;
            this.tm=tm;
        }
    }
