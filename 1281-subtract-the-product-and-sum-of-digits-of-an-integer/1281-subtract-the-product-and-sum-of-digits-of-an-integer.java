class Solution {
    public int subtractProductAndSum(int n) {
        int mul=1;
        int sum=0;
        int r=0;
        while(n>0)
        {
            r=n%10;
            mul*=r;
            sum+=r;
            n/=10;
        }
        return mul-sum;
    }
}