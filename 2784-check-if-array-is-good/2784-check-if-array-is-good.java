class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<nums.length;i++)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        map.put(n-1,map.getOrDefault(n-1,0)+1);
        for(int i=0;i<nums.length;i++)
        {
            if(map.getOrDefault(nums[i],0)>0)
            {
                map.put(nums[i],map.getOrDefault(nums[i],0)-1);
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}