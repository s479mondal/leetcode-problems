class Solution {
    public int compress(char[] chars) {
        int l=0;
        int r=chars.length-1;
        int count=0;
        int index=0;
        while(l<=r)
        {
            char c=chars[l];
            count=1;
            while(l<r && c==chars[l+1])
            {
                l++;
                count++;
            }
            chars[index++]=c;
            if(count>1)
            {
                String s=String.valueOf(count);
                for(char t:s.toCharArray())
                {
                    chars[index++]=t;
                }
            }
            l++;
        }
        return index;
    }
}