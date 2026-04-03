class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map=new  HashMap<>();

        for(char c:t.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int min=Integer.MAX_VALUE;
        int left=0;
        int count=0;
        int start=0;
        for(int right=0;right<s.length();right++)
        {
            if(map.getOrDefault(s.charAt(right),0)>0)
            {
                count++;
            }
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)-1);
            while(count==t.length())
            {
                if(right-left+1<min)
                {
                    min=right-left+1;
                    start=left;
                }

                char l=s.charAt(left);
                map.put(l,map.getOrDefault(l,0)+1);
                if(map.get(l)>0)
                {
                    count--;
                }
                left++;
            }
        }
        return min==Integer.MAX_VALUE ? "" :s.substring(start, start+min); 

    }

}