class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int i=0;
        for(int n:map.keySet())
        {
            int p=map.get(n);
            while(p>0)
            {
                nums[i++]=n;
                p--;
            }
        }
    }
}