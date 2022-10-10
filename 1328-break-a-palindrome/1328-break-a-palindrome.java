class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length() == 1) return "";
        char[] arr = palindrome.toCharArray();
        for(int i = 0; i < palindrome.length()/2; i++){
            if(arr[i] != 'a'){
                arr[i] = 'a';
                return String.valueOf(arr);
            }
        }
        if(arr[arr.length - 1] == 'a') arr[arr.length - 1] = 'b';
        else arr[arr.length - 1] = 'a';
        return String.valueOf(arr);
    }
}