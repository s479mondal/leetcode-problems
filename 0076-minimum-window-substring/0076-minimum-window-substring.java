class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:t.toCharArray())
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int left=0;
        char[] c=s.toCharArray();
        int count=0;
        int start=0;
        int min=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++)
        {
            char r=c[right];
            if(map.getOrDefault(r,0)>0)
            {
               count++; 
            }
            map.put(r,map.getOrDefault(r,0)-1);
            while(count==t.length())
            {
                if(right-left+1<min)
                {
                    min=right-left+1;
                    start=left;
                }
                map.put(c[left],map.getOrDefault(c[left],0)+1);
                if(map.getOrDefault(c[left],0)>0){
                    count--;
                }
                left++;
            }
        }
        return min==Integer.MAX_VALUE?"":s.substring(start,start+min);
    }
}