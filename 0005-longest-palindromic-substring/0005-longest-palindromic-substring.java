class Solution {
    int max=0;
    int min=0;
    public void check(String s,int left,int right)
    {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
            
        }
        if(max<right-left-1)
        {
            max=right-left-1;
            min=left+1;
            
        }
    }
    public String longestPalindrome(String s) {
        if(s.length()==1 )
        {
            return s;
        }
        
        for(int i=0;i<s.length();i++)
        {
            
            check(s,i,i);
            check(s,i,i+1);

        }
        return s.substring(min,max+min);
    
    }
}