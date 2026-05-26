class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<word.length();i++)
        {
            set.add(word.charAt(i));
        }
        int c=0;
        HashSet<Character> used=new HashSet<>();
        for(int i=0;i<word.length();i++)
        {
            char cr=word.charAt(i);
            if(!used.contains(cr) && set.contains(Character.toLowerCase(cr)) && set.contains(Character.toUpperCase(cr)))
            {
                c++;
                used.add(cr);
            }
        }
        return c/2;
    }
}