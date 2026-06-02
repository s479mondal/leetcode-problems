class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int h=0;
        int min=Integer.MAX_VALUE;
        int l=0;
        int r=height.length-1;
        h=Math.min(height[l],height[r]);
        max=Math.max(max,h*(r-l));
        while(l<r)
        {
            if(height[l]>height[r])
            {
                r--;
            }
            else
            {
                l++;
            }
        h=Math.min(height[l],height[r]);
        max=Math.max(max,h*(r-l));
        }
        return max;
    }
}