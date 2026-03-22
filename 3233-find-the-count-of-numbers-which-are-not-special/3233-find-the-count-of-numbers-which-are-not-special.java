class Solution {
    public int nonSpecialCount(int l, int r) {
        int length=r-l+1;
        int start=(int)Math.ceil(Math.sqrt(l));
        int end=(int)Math.floor(Math.sqrt(r));
        int total=end-start+1;
        boolean b[]=new boolean[end+1];
        for(int i=2;i<=end;i++)
        {
            b[i]=true;
        }
        b[0]=false;
        b[1]=false;
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
        return length-c;
    }
}