class Solution {
    public int palindromicSubString(String s,int left,int right){
        int count=0;

        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
            count++;
        }
        return count;
    }

    public int countSubstrings(String s) {
        int count=0;
    if(s.length()==0 || s==null)
    {
        return 0;
    }
        for(int i=0;i<s.length();i++)
        {
                count+=palindromicSubString(s,i,i);

                count+=palindromicSubString(s,i,i+1);
        }
        return count;
    }
}