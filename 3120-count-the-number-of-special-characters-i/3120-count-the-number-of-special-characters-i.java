class Solution {
    public int numberOfSpecialChars(String word) {
        int[] f=new int[123];
        char[] ch =word.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++)
        {
            f[ch[i]]++;
        }
        for(int i=97;i<123;i++)
        {
            int cap=i-32;
            if(f[i]>0 && f[cap]>0)
            {
                count++;
            }
        }
        return count;
    }
}