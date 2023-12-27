

class MakeZeroes
{
    public void  MakeZeros(int[][] matrix)
    {
        //int code here
        int row = matrix.length;
        int col = matrix[0].length;
        
        int t[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                t[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(t[i][j]==0)
                {
                    if(i-1>=0)//up
                    {
                        matrix[i][j]+=t[i-1][j];
                        matrix[i-1][j]=0;
                    }
                    if(i+1<row) //down
                    {
                        matrix[i][j]+=t[i+1][j];
                        matrix[i+1][j]=0;
                    }
                    if(j-1>=0) //left
                    {
                        matrix[i][j]+=t[i][j-1];
                        matrix[i][j-1]=0;
                    }
                    if(j+1<col) //right
                    {
                        matrix[i][j]+=t[i][j+1];   
                        matrix[i][j+1]=0;
                    }
                }
            }
        }
    }
}