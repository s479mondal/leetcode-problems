class Solution {
    public int nonSpecialCount(int l, int r) {
        int start=(int)Math.ceil(Math.sqrt(l));
        int end=(int)Math.floor(Math.sqrt(r));
        int n=r-l+1;
        boolean b[]=new boolean[end+1];
        for(int i=2;i<b.length;i++)
        {
            b[i]=true;
        }
        for(int i=2;i*i<=end;i++)
        {
            if(b[i])
            {
                for(int j=i*i;j<=end;j+=i)
                {
                    b[j]=false;
                }
            }
        }
        int c=0;
        for(int i=start;i<=end;i++)
        {
            if(b[i])
            {
                c++;
            }
        }
        return n-c;
    }
}