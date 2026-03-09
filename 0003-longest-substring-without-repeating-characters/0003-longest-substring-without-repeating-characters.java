class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int r=Integer.MIN_VALUE;
        if(s.length()==0)
        {
            return 0;
        }
        for(int i=0;i<s.length();i++)
        {
            while(set.contains(s.charAt(i)))
            {
                    set.remove(s.charAt(l));
                    l++;
            }
            set.add(s.charAt(i));
            r=Math.max(r,i-l+1);
        }
        return r;
    }
}