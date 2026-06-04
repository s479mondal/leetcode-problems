class Solution {
    public int countValidWords(String sentence) {
        String[] s=sentence.trim().split("\\s+");
        int count=0;
        for(int i=0;i<s.length;i++)
        {
          if(s[i].matches("^([a-z]+(-[a-z]+)?)?[!.,]?$"))
          {
            count++;
          }
        }
        return count;
    }
}