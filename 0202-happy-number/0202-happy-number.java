class Solution {
    public boolean isHappy(int n) {
        int sum=n;
        int r=0;
        int t=n;
        if(n==1)
        {
            return true;
        }
        HashSet<Integer> set=new HashSet<>();
        while(n!=1 && !set.contains(n))
        {
            set.add(n);
            sum=0;
            while(n!=0)
            {
                r=n%10;
                sum+=r*r;
                n/=10;
        
            }
            n=sum;
        }
        return sum==1?true:false;
    }
}