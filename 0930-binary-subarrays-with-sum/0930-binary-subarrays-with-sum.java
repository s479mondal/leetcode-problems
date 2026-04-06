class Solution {
    public int sumBinary(int nums[],int target)
    {
        if(target<0)
        {
            return 0;
        }
        int left=0;
        int sum=0;
        int count=0;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];
            while(sum>target)
            {
                sum-=nums[left];
                left++;
            }
            count+=(right-left+1);
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return sumBinary(nums,goal)-sumBinary(nums,goal-1);
    }
}