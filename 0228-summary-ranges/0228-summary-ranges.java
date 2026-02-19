class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> lt =new ArrayList<>();
        if(nums.length==0)
        {
            return lt;
        }
        int left=nums[0];
        for(int i=1;i<nums.length;i++)
        {           
            if(nums[i-1]+1!=nums[i])
            {
              if(nums[i-1]==left)
              {
                lt.add(String.valueOf(nums[i-1]));
              }
              else
              {
                lt.add(left+"->"+nums[i-1]);
              }
              left=nums[i];
            }
        }
        if(nums[nums.length-1]==left)
        {
            lt.add(String.valueOf(left));
        }
        else
        {
            lt.add(left+"->"+nums[nums.length-1]);
        }
        return lt;
    }
}