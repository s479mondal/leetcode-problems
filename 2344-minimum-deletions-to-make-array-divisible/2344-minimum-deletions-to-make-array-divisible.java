class Solution {
    public int gcd(int a,int b)
    {
       return b==0 ? a: gcd(b,a%b);
    }
    public int p(int nd[])
    {
        int a=nd[0];
        for(int i=1;i<nd.length;i++)
        {
            a=gcd(a,nd[i]);
        }
        return a;
    }
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        int a=p(numsDivide);
        for(int i=0;i<nums.length;i++)
        {
            if(a%nums[i]==0)
            {
                return i;
            }
        }
        return -1;
    }
}