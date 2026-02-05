class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a[]=new int[nums.length];
        a[0]=1;
        int s=1;
        for(int i=1;i<nums.length;i++)
        {
            a[i]=a[i-1]*nums[i-1];
        
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            a[i]=a[i]*right;
            right*=nums[i];
        }
        return a;
    }
}