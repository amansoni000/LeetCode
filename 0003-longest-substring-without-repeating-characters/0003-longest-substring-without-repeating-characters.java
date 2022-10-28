class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0, len = 0;
        while(i < s.length() && j < s.length()){
            while(j < s.length() && !set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }
            len = Math.max(j-i, len);
            while(j < s.length() && set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
        }
        len = Math.max(j-i, len);
        return len;
    }
}