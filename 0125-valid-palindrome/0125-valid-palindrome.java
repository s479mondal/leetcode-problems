class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char c[]=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(char ca:c)
        {
           if(Character.isLetterOrDigit(ca))
           {
                sb.append(ca);
           }
        }
        if((sb.toString()).equals((sb.reverse()).toString()))
        {
              
            return true;
          
        }
        return false;
    }
}
