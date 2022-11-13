class Solution {
    public String reverseWords(String s) {
        String[] arr = s.strip().split(" +");
        String ans = "";
        for(int i = arr.length-1; i >= 0; i--){
            if(i == 0){
                ans += arr[i];
            }
            else ans += arr[i] + " ";
        }
        return ans;
    }
}