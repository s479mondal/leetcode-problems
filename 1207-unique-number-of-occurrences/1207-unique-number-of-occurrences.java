class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int m:arr)
        {
            map.put(m,map.getOrDefault(m,0)+1);
        }
        Set<Integer> set=new HashSet<>();
        for(int m:map.values())
        {
            set.add(m);
        }
        if(set.size()==map.size())
        {
            return true;
        }
        return false;

    }
}