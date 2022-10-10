class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length() == 1) return "";
        char[] arr = palindrome.toCharArray();
        boolean flag = true;
        if(arr[0] != 'a') arr[0] = 'a';
        else{
            for(int i = 1; i < palindrome.length(); i++){
                if(arr[i] > arr[i-1]){
                    if(arr.length%2 != 0 && i == arr.length/2) continue;
                    // System.out.println(i);
                    if(arr[i] == 'a') arr[i] = 'b';
                    else arr[i] = 'a';
                    flag = false;
                    break;
                }
            }
            if(flag){
                if(arr[arr.length - 1] == 'a') arr[arr.length - 1] = 'b';
                else arr[arr.length - 1] = 'a';
            }
        }
        return String.valueOf(arr);
    }
}