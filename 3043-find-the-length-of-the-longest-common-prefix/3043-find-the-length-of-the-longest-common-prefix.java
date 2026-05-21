class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            String s=Integer.toString(arr1[i]);
            int n=s.length();
            while(n>0)
            {
                set.add(s.substring(0,n));
                n--;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr2.length;i++)
        {
            String s=Integer.toString(arr2[i]);
            int n=s.length();
            
            while(n>0)
            {
                String t=s.substring(0,n);
                if(set.contains(t))
                {
                    max=Math.max(max,n);
                }
                n--;
            }
        }
        return max==Integer.MIN_VALUE?0:max;
        
    }
}