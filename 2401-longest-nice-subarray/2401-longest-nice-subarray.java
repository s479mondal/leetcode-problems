class Solution {
    public int longestNiceSubarray(int[] nums) {
        int max=1;
        for(int i=0;i<nums.length-1;i++)
        {
            int mask=0;
            for(int j=i;j<nums.length;j++)
            {
                if((mask & nums[j])!=0)
                {
                    break;
                }
                mask|=nums[j];
                max=Math.max(max,j-i+1);
            }
        }
        return max;
    }
}