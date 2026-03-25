class Solution {
    public int[][] constructProductMatrix(int[][] grid) {

        int m=grid.length;
        int n=grid[0].length;
        int pre[][]=new int[m][n];
        int su[][]=new int[m][n];
        long p=1;
        long s=1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                pre[i][j]=(int)p;
                p=(p*grid[i][j])%12345;
            }
        }
        for(int i=m-1;i>=0;i--)
        {
            for(int j=n-1;j>=0;j--)
            {
                su[i][j]=(int)s;
                s=(s*grid[i][j])%12345;
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                pre[i][j]=(pre[i][j]*su[i][j])%12345;
            }
        }
        return pre;
        

    }
}