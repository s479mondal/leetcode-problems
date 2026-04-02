class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int zeroCount=0;
        int l=0;
        for(int r=0;r<nums.length;r++)
        {
            if(nums[r]==0)
            {
                zeroCount++;
            }
            while(zeroCount>k)
            {
                if(nums[l]==0)
                {
                    zeroCount--;
                }
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}