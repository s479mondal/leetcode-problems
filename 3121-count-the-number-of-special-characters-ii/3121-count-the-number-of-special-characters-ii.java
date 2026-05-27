class Solution {
    public int numberOfSpecialChars(String word) {
        int[] l=new int[26];
        int[] u=new int[26];
        Arrays.fill(l,-1);
        Arrays.fill(u,-1);
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(Character.isLowerCase(c))
            {
                int id=c-'a';
                l[id]=i;
            }
            else
            {
                int ip=c-'A';
                if(u[ip]==-1)
                {
                    u[ip]=i;
                }
            }
        }
        for(int i=0;i<26;i++)
        {
            if(l[i]!=-1 && u[i]!=-1 && l[i]<u[i])
            {
                count++;
            }
        }
        return count;
    }
}