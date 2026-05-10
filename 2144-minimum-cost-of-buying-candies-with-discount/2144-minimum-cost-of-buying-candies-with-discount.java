class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length==2)
        {
            return cost[0]+cost[1];
        }
        Arrays.sort(cost);
        int sum=0;
        int count=2;
        for(int i=cost.length-1;i>=0;i--)
        {
            if(count>0)
            {
                sum+=cost[i];
                count--;
            }
            else
            {
                count=2;
            }
        }
        return sum;

    }
}