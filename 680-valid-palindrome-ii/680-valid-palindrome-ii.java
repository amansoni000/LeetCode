class Solution {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        boolean flag = true;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else break;
        }
        int start = i, end = j;
        while(i + 1 < j){
            if(s.charAt(i + 1) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                flag = false;
                break;
            }
        }
        while(start < end - 1 && flag == false){
            if(s.charAt(start ) == s.charAt(end - 1)){
                start++;
                end--;
            }
            else return false;
        }
        return true;
    }
}