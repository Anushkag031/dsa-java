class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top, bottom , left, right, dir;
        top=0;
        bottom=matrix.length-1;
        left=0;
        right=matrix[0].length-1;
        dir=0;

        ArrayList<Integer> ans=new ArrayList<>();

        while(top<=bottom && left<=right)
        {
            if(dir==0)
            {
                for(int i=left; i<=right; i++)  // --> direction
                ans.add(matrix[top][i]);       

                top++;
            }
            else if(dir==1)
            {
                for(int i=top; i<=bottom; i++) // |
                ans.add(matrix[i][right]);     // v

                right--;
            }
            else if(dir==2)
            {
                for(int i=right; i>=left; i--)  // <--
                ans.add(matrix[bottom][i]);    

                bottom--;
            }
            else if(dir==3)
            {
                for(int i=bottom; i>=top; i--)  // ^
                ans.add(matrix[i][left]);       // |

                left++;
            }
            dir=(dir+1)%4;
        }
        return ans;
    }
}
