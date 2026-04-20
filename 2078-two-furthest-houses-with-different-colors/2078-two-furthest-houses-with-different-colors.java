class Solution {
    public int maxDistance(int[] colors) {
        int dis=0;
        for(int i=colors.length-1;i>=0;i--)
        {
            if(colors[0]!=colors[i] || colors[colors.length-1]!=colors[colors.length-i-1])
            {
                dis=Math.max(dis,i);
            }
        }
        return dis;
    }
}