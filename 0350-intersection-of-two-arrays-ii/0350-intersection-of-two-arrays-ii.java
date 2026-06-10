class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int n:nums2)
        {
            if(map.containsKey(n))
            {
                arr.add(n);
                map.put(n,map.getOrDefault(n,0)-1);
            if(map.get(n)==0)
            {
                map.remove(n);
            }
            }
        }
        int[] a=new int[arr.size()];
        int j=0;
        for(int n:arr)
        {
            a[j++]=n;
        }
        return a;
    }
}