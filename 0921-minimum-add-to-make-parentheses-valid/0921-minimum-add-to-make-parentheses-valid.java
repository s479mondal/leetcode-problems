class Solution {
    public int minAddToMakeValid(String s) {
    

        int left=0;     
        int right=0;
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            char cr=s.charAt(i);
            if(cr=='(')
            {
                left++;
            }
            else
            {
                if(left>0)
                {
                    left--;
                }
                else
                {
                    right++;
                }
            }
            
        }
        ans=left+right;
        return ans;
    }
}