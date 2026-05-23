class Solution {
    public boolean hasAlternatingBits(int n) {
        int c=n&1;
        while(n!=0)
        {
            n>>=1;
            int r=n&1;
            if(c==r)
            {
                return false;
            }
            c=r;
        }
        return true;
    }
}