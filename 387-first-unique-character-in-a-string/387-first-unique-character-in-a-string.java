class Solution {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        int ans = -1;
        for(int i = s.length()-1; i>=0; i--){
            arr[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            if(arr[s.charAt(i) - 'a'] == 1) return i;
        }
        return ans;
    }
}