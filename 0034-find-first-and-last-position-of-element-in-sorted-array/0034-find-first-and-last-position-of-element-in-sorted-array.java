class Solution {
    public static int searchFirst(int[] nums,int target)
    {
        int left=0;
        int right=nums.length;
        int ans=-1;
        while(left<right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                right=mid-1;
            }
            if(nums[mid]>=target)
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }
        }
        return ans;
    }
    public static int searchSecond(int[] nums, int target)
    {
        int left=0;
        int right=nums.length;
        int ans=-1;
        while(left<right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                left=mid+1;
            }
            if(nums[mid]>target)
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }
        } 
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n1=searchFirst(nums,target);
        int n2=searchSecond(nums,target);
        return new int[]{n1,n2};
    }
}