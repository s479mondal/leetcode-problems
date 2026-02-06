class Solution {
    public int characterReplacement(String s, int k) {
        int a[]=new int[26];
        int l=0;
        int f=0;
        int maxLen=0;
        for(int r=0;r<s.length();r++)
        {
            a[s.charAt(r)-'A']++;

            f=Math.max(f, a[s.charAt(r)-'A']);

            while((r-l+1)-f>k)
            {
                a[s.charAt(l)-'A']--;
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);


        }
        return maxLen;
    }
}