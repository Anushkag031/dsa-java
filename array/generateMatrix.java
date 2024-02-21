class Solution {
    public int[][] generateMatrix(int n) {

        int ans[][]=new int[n][n];

        int left=0; //first row
        int right=n-1; //last row

        int top=0; //first col
        int bottom=n-1; //last col

        int val=1;

        while(left<=right && top<=bottom)
        {
            //first row
            for(int i=left; i<=right; i++)
            {
                ans[top][i]=val;
                val++;
            }
            top++;

            //last col
            for(int j=top; j<=bottom; j++)
            {
                ans[j][right]=val;
                val++;
            }
            right--;

            //last row
            for(int i=right; i>=left; i--)
            {
                ans[bottom][i]=val;
                val++;
            }
            bottom--;

            //first col
            for(int j=bottom ; j>=top; j--)
            {
                ans[j][left]=val;
                val++;
            }
            left++;

        }
        return ans;
        
    }
}
