class Solution {
    public int findMin(int[] nums) {
         int l=0;
            int h=nums.length-1;
            int mid=0;
            int ans=1000000;
            while(l<=h)
                {
                    mid=l+(h-l)/2;
                    if(nums[l]<=nums[h])
                    {
                        ans=Math.min(ans,nums[mid]);
                    }
                    if(nums[l]<=nums[mid])
                    {
                        ans=Math.min(ans,nums[l]);
                        l=mid+1;
                    }
                    else
                    {
                        ans=Math.min(ans,nums[mid]);
                        h=mid-1;
                    }
                }
                   return ans;
    }
}