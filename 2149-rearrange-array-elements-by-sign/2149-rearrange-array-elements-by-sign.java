class Solution {
    public int[] rearrangeArray(int[] nums) {
        int a[]=new int[nums.length];
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> n=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                p.add(nums[i]);
            }
            else
            {
                n.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length/2;i++)
        {
                a[i*2]=p.get(i);
                a[i*2+1]=n.get(i);
        
        }
        return a;
    }
}