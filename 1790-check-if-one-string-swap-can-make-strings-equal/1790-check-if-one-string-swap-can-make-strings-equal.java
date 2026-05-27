class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
        {
            return true;
        }
        if(s1.length()!=s2.length())
        {
            return false;
        }
        int n=s1.length();
        int f=-1;
        int l=-1;
        int c=0;
        for(int i=0;i<s1.length();i++)
        {
           if(s1.charAt(i)!=s2.charAt(i))
           {
                c++;
                if(f==-1)
                {
                    f=i;
                }
                else
                {
                    l=i;
                }
           }
        }
        if(c!=2)
        {
            return false;
        }
        return s1.charAt(f)==s2.charAt(l) && s1.charAt(l)==s2.charAt(f);
    }
}