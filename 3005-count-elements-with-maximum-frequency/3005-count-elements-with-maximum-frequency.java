class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i:map.values())
        {
            if(i>max)
            {
                max=i;
                sum=0;
            }
            if(i==max)
            {
                sum+=i;
            }
        }
        return sum;
    }
}