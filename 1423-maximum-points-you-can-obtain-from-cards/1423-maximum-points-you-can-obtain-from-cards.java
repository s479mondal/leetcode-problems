class Solution {
    public int maxScore(int[] cardPoints, int k){
        
        int sum=0;
        int max=0;
        for(int i=0;i<k;i++)
        {
            sum+=cardPoints[i];
        }
        max=sum;
        int n=k-1;
        for(int i=cardPoints.length-1;i>=cardPoints.length-k;i--)
        {
            sum+=cardPoints[i]-cardPoints[n--];
            max=Math.max(max,sum);
        }
        return max;
    }
}