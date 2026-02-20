class Solution {
    public int minSwaps(String s) {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='[')
            {
                c++;
            }
            else
            {
                if(c>0)
                {
                    c--;
                }
            }
        }
        return (c+1)/2;
    }
}