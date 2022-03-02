class Solution {
    public boolean isSubsequence(String s, String t) {
        int ptr1 = 0, ptr2 = 0;
        while(ptr1 < t.length() && ptr2 < s.length()){
            if(t.charAt(ptr1) == s.charAt(ptr2)){
                ptr2++;
            }
            ptr1++;
        }
        if(ptr2 == s.length()) return true;
        else return false;
    }
}