class Solution {
    public String convertToBase7(int num) {
        int mul=1;
        int base7=0;
        while(num!=0)
        {
            int r=num%7;
            base7+=r*mul;
            mul*=10;
            num/=7;
        }
        
        return Integer.toString(base7);
    }
}