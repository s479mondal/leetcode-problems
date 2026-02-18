class Solution {
    public int trap(int[] n) {
        int pre[]=new int [n.length];
        int suf[]=new int [n.length];
        int wat=0;
        pre[0]=n[0];
        for(int i=1;i<n.length;i++){
            pre[i]=Math.max(n[i],pre[i-1]);
        }
        suf[n.length-1]=n[n.length-1];
        for(int i=n.length-2;i>=0;i--){
            suf[i]=Math.max(n[i],suf[i+1]);
        }

        for(int i=0;i<n.length;i++){
            wat+=Math.min(pre[i],suf[i])-n[i];
        }
        return wat;
    }
}
