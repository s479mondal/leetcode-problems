class Solution {
    public int minElement(int[] nums) {
        int sum=0;
        int p=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            p=nums[i];
            sum=0;
            while(p>0)
            {
                int r=p%10;
                sum+=r;
                p/=10;
            }
            min=Math.min(min,sum);
        }
        return min;
    }
}