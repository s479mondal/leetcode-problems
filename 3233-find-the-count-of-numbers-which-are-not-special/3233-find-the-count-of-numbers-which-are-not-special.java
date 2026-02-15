class Solution {
  
    public int nonSpecialCount(int l, int r) {
          int length=r-l+1;

          int s=(int) Math.ceil(Math.sqrt(l));
          int e=(int) Math.floor(Math.sqrt(r));
        
          boolean b[]=new boolean[e+1];
          b[0]=b[1]=false;
          for(int i=2;i<=e;i++)
          {
                b[i]=true;
          }
          for(int i=2;i*i<=e;i++)
          {
            if(b[i])
            {
                for(int j=i+i;j<=e;j+=i)
                {
                    b[j]=false;
                }
            }
          }
          int c=0;
          for(int i=s;i<=e;i++)
          {
            if(b[i])
            {
                c++;
            }
          }
          return length-c;


    }
}