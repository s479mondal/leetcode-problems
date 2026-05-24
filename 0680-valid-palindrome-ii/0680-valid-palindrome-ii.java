class Solution {
    public static boolean check(String s,int l,int r)
    {
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        int c=0;
        while(l<r)
        {
            char c1=s.charAt(l);
            char c2=s.charAt(r);
            if(l<r && !Character.isLetterOrDigit(c1))
            {
                l++;
            }
            if(l<r && !Character.isLetterOrDigit(c2))
            {
                r--;
            }
            if(Character.toLowerCase(c1)!=Character.toLowerCase(c2))
            {
                return check(s,l+1,r) || check(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
}