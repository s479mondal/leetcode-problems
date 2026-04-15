class Solution {
    public int subKdigit(int nums[], int k)
    {
        int left=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        int count=0;
        for(int right=0;right<nums.length;right++)
        {
            if(map.size()<=k)
            {
                map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            }
                while(map.size()>k)
                {
                    map.put(nums[left],map.getOrDefault(nums[left],0)-1);
                    if(map.get(nums[left])==0)
                    {
                        map.remove(nums[left]);
                    }
                    left++;
                }
            
            count+=right-left+1;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subKdigit(nums,k)-subKdigit(nums,k-1);
    }
}