class Solution {
    public boolean checkOnesSegment(String s) {
        int n=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i)=='0')
            {
                return false;
            }
        }
        return true;
    }

}