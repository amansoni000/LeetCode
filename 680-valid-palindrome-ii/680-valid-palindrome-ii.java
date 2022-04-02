class Solution {
    public boolean helper(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            else return false;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        boolean flag = true;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return (helper(s, i+1, j) || helper(s, i, j-1));
            }
        }
        return true;
    }
}