class Solution {
    public int countPrefixes(String[] words, String s) {
        int c = 0;
        for(String st: words)
        {
            if(s.startsWith(st)) c++;
        }
        return c;
    }
}