class Solution {
    public int convert(String s)
    {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
        {
            sb.append(c-'a');
        }
        return Integer.parseInt(sb.toString());
    }
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int n1=convert(firstWord);
        int n2=convert(secondWord);
        int sum=convert(targetWord);
        return sum==n1+n2;
    }
}