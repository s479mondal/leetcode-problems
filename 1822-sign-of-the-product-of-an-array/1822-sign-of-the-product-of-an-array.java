class Solution {
    public int arraySign(int[] nums) {
        int n=0;
        for(int i:nums)
        {
            if(i<0)
            {
                n++;
            }
            if(i==0)
            {
                return 0;
            }
        }
        return n%2==0?1:-1;
    }
}