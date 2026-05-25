class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int mid=0;
        while(mid<=h)
        {
            if(nums[mid]==0)
            {
                int t=nums[l];
                nums[l++]=nums[mid];
                nums[mid++]=t; 
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                int t=nums[mid];
                nums[mid]=nums[h];
                nums[h--]=t;
            }
        }
    }
}