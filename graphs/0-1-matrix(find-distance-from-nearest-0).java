class Pair
{
    int row; int col; int distance;
   Pair(int row, int col, int distance)
    {
        this.row=row;
        this.col=col;
        this.distance=distance;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        boolean[][] vis = new boolean[n][m];
        int[][] ans = new int[n][m];

        Queue<Pair> q=new LinkedList<Pair>();

        for(int i=0; i<n;i++)
        {
            for(int j=0; j<m; j++)
            {
                if(mat[i][j]==0)
                {
                    q.add(new Pair(i,j,0));
                    vis[i][j]=true;
                }
            }
        }

        int dr[]={-1,0,1,0};
        int dc[]={0,1,0,-1};

        while(!q.isEmpty())
        {
            int row=q.peek().row;
            int col=q.peek().col;
            int distance=q.peek().distance;

            ans[row][col]=distance;
            q.poll();


            for(int i=0; i<4; i++)
            {
                int nrow=row+dr[i];
                int ncol=col+dc[i];

                if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && !vis[nrow][ncol])
                {
                    vis[nrow][ncol]=true;
                    q.add(new Pair(nrow,ncol,distance+1));
                }
            }
        }
        return ans;
    }
}
