class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int n:nums)
        {
            if(map.get(n)>nums.length/2)
            {
                return n;
            }
        }
        return -1;
    }
}