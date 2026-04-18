class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int left=0;
        int pre=1;
        int suf=1;
        for(int right=0;right<nums.length;right++)
        {
            if(pre==0)
            {
                pre=1;
            }
            if(suf==0)
            {
                suf=1;
            }
            pre*=nums[right];
            suf*=nums[nums.length-right-1];
            max=Math.max(pre,Math.max(suf,max));
        }
        return max;
    }
}