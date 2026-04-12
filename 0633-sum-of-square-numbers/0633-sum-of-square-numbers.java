class Solution {
    public boolean judgeSquareSum(int c) {
        long n=(long)Math.sqrt(c);
        int low=0;
        long high=n;
        int mid=0;
        while(low<=high)
        {
            long sum=low*low+high*high;
            if(sum==(long)c)
            {
                return true;
            }
            if(sum>(long)c)
            {
                high--;
            }
            else
            {
                low++;
            }
        }
        return false;
        
    }
}