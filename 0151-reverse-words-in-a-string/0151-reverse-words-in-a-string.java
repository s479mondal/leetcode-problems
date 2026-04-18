class Solution {
    public String reverseWords(String s) {
        String n[]=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=n.length-1;i>=0;i--)
        {
            sb.append(n[i]);
            if(i!=0)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}