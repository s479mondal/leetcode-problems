class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length())
       {
        return false;
       }
       int l=s.length();
       HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<l;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char a:t.toCharArray())
        {
            if(!map.containsKey(a))
            {
                return false;
            }
            map.put(a,map.get(a)-1);
            if(map.get(a)==0)
            {
                map.remove(a);
            }
        }
        return map.isEmpty();
    }
}