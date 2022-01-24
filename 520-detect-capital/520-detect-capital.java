class Solution {
    public boolean detectCapitalUse(String word) {
        String s1 = word.toLowerCase();
        String s2 = word.toUpperCase();
        String s3 = word.substring(1,word.length()).toLowerCase();
        String s4 = word.substring(0,1) + s3;
        if(s1.equals(word)) return true;
        if(s2.equals(word)) return true;
        if(s4.equals(word)) return true;
        return false;
    }
}