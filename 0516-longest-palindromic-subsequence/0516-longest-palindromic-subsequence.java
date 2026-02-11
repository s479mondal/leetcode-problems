class Solution {
    public int rev(String t1,String t2)
    {
        int n=t1.length();
        int m=t2.length();

        int p[]=new int[m+1];
        int c[]=new int[m+1];

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(t1.charAt(n-i)==t2.charAt(m-j))
                {
                    c[j]=1+p[j-1];
                }
                else
                {
                    c[j]=Math.max(p[j],c[j-1]);
                }
            }

            System.arraycopy(c,0,p,0,m+1);
        }
        return p[m];
    }
    public int longestPalindromeSubseq(String s) {
        String t=new StringBuilder(s).reverse().toString();

        return rev(s,t);
    }
}