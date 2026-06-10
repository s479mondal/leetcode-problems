class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] a=new int[r][c];
        for(int i=0;i<c;i++)
        {
            for(int j=r-1;j>=0;j--)
            {
                a[i][(r-1)-j]=matrix[j][i];
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=a[i][j];
            }
        }
    }
}