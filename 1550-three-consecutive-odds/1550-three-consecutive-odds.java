class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        int left=0;
        for(int i=0;i<arr.length;i++)
        {
            left=i;
            count=0;
            while(left<arr.length && arr[left]%2==1 )
            {
                left++;
                count++;
                if(count==3)
                {
                    return true;
                }
            }
        }
        return false;
    }
}