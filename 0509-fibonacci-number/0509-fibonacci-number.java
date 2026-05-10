class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int c=a+b;
        if(n==0)
        {
            return a;
        }
        if(n==1)
        {
            return b;
        }
        else
        {
            for(int i=2;i<=n;i++)
            {
                c=a+b;
                a=b;
                b=c;
            }
        }
        return c;
    }
}