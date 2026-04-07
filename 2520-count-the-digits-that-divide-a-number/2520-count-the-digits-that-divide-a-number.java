class Solution {
    public int countDigits(int num) {
        int r=0;
        int temp = num;
        if(num==0)
        {
            return 1;
        }
        int a[]=new int[10];
        Arrays.fill(a,0);
        while(num>0)
        {
            int d=num%10;
            if(temp % d ==0)
                a[d]+=1;
            num/=10;
        }
        int count=0;
        for(int element : a){
            if(element != 0){
                count+=element;
            }
        }
        return count;
    }
}