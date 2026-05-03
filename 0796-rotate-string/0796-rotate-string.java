class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length()!=goal.length())
        {
            return false;
        }
        StringBuilder st=new StringBuilder(s);
        String t="";
        for(int i=0;i<s.length();i++)
        {
            st.append(s.charAt(i));
            System.out.println(st.toString());
            st.delete(0,1);
            System.out.println(st.toString());
            if(goal.equals(st.toString()))
            {
                return true;
            }
        }
        return false;
    }
}