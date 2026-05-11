class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--)
        {
            while(nums[i]>=10)
            {
                arr.add(nums[i]%10);
                nums[i]/=10;
                if(nums[i]<10)
                {
                    break;
                }
            }
            arr.add(nums[i]%10);

        }
        Collections.reverse(arr);
        int a[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            a[i]=arr.get(i);
        }
        return a;
    }
}