class Solution {
    void ph(HashMap<Integer,String> map,String digit, List<String> list, String result)
    {
        if(digit.length()==0)
        {
            list.add(result);
            return;
        }
        int d=digit.charAt(0)-'0';

        String letter=map.get(d);

        for(int i=0;i<letter.length();i++)
        {
            ph(map,digit.substring(1),list,result+letter.charAt(i));
        }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String> map=new HashMap<>();

        map.put(0,"");
        map.put(1,"");
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        List<String> l=new ArrayList<>();
        String result="";
        ph(map,digits,l,result);

        return l;
    }
}