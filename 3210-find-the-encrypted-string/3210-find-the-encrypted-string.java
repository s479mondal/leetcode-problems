class Solution {
    public String getEncryptedString(String s, int k) {
        String r="";

            k%=s.length();
        
        for(int i=k;i<s.length();i++)
        {
            r+=s.charAt(i);
        }
        int j=0;
        while(j<k)
        {
            r+=s.charAt(j);
            j++;
        }
        return r;
    }
}