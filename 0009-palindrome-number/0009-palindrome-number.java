class Solution {
    public boolean isPalindrome(int x) {
        int r=0;
        int a=x;
        int s=0;
        if(x<(-10))
        {
            return false;
        }
        while(x>0)
        {
            r=x%10;
            s=s*10+r;
            x/=10;
        }
        return s==a?true:false;
    }
}