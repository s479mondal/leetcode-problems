class Solution {
    public String sortString(String s) {
        int len=s.length();
        int count=0;
        int fre[]=new int[26];
        StringBuilder sb=new StringBuilder(len);
        for(int i=0;i<len;i++)
        {
            fre[s.charAt(i)-'a']++;
        }
        while(count<len)
        {
            for(int i=0;i<26;i++)
            {
                if(fre[i]>0)
                {
                    sb.append((char)(i+'a'));
                    fre[i]=fre[i]-1;
                    count++;
                }
            }
            for(int i=25;i>=0;i--)
            {
                if(fre[i]>0)
                {
                    sb.append((char)(i+'a'));
                    fre[i]=fre[i]-1;
                     count++;
                }
            }
        }
        return sb.toString();
    }
}