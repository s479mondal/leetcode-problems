class Solution {
    public int minFlips(String s) {
        int n=s.length();
        int d1=0;
        int d2=0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<2*n;i++)
        {
            char c1=(i%2==0)?'0':'1';
            char c2=(i%2==0)?'1':'0';
            if(s.charAt(i%n)!=c1)
            {
                d1++;
            }
            if(s.charAt(i%n)!=c2)
            {
                d2++;
            }

            if(i>=n)
            {
                char ct=s.charAt(i%n);
                char left1=((i%n)%2==0)?'0':'1';
                char left2=((i%n)%2==0)?'1':'0';
                if(ct!=left1) d1--;
                if(ct!=left2) d2--;
            }
            if(i>=n)
            {
                res=Math.min(res,Math.min(d1,d2));
            }
        }
        return res;
    }
}