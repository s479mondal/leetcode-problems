class Solution {
    public int minPartitions(String n) {
        char c[]=n.toCharArray();
        boolean flag=true;
        int w=0;
        while(flag)
        {
            flag=false;
            for(int i=0;i<c.length;i++)
            {
                if(c[i]!='0')
                {
                    c[i]--;
                    flag=true;
                    
                }
            }
            if(!flag)
            {
                break;
            }
            w++;
        }
        return w;
    }
}