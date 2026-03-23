class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int a=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(a==nums[i])
            {
                c++;
            }
            else
            {
                c--;
                if(c<0)
                {
                    c=0;
                    a=nums[i];
                }
            }
        }
        return a;
    }
}