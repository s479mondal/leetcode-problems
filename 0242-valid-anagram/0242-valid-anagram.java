class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length())
       {
        return false;
       }
       int l=s.length();
       int fr[]=new int[26];
        for(int i=0;i<l;i++)
        {
            fr[s.charAt(i)-'a']++;
            fr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(fr[i]!=0)
            {
                return false;
            }
        }
        return true;

    }
}