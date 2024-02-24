class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    // code here 
	    int N=matrix.length;
        int M=matrix[0].length;

        int row=0;
        int col=M-1;//last of first row

        while(row < N &&  col>=0)
        {
            if(matrix[row][col]==x)
            return true;
            else if(matrix[row][col] <  x)
            row++;
            else
            col--;

        }
        return false;
	} 
} 
