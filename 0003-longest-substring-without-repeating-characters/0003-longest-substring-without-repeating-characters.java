class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int right=s.length()-1;
        int l=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            while(set.contains(c))
            {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}