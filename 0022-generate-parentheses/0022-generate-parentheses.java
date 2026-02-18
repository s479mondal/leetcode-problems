class Solution {
    public void re(List<String> list,int n,String s, int o, int c)
    {
        if(s.length()==n*2)
        {
            list.add(s);
            return;
        }

        if(o<n)
        {
            re(list,n,s+"(",o+1,c);
        }
        if(c<o)
        {
            re(list,n,s+")",o,c+1);
        }

        
    }
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();

        re(list,n,"",0,0);
        return list;
    }
}