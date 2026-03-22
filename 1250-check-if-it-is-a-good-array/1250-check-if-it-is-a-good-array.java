class Solution {
    public static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
    public boolean isGoodArray(int[] nums) {
        int r=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            r=gcd(r,nums[i]);
            if(r==1)
            {
                return true;
            }
        }
        return r==1;
    }
}