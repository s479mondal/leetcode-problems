class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;

        for(String s:sentences)
        {
            int c=0;
            for(String sn:s.split(" "))
            {
                c++;
            }
            max=Math.max(max,c);
        }
        return max;
    }
}