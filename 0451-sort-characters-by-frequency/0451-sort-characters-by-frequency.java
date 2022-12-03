class Solution {
    public String frequencySort(String s) {
        int[][] arr = new int[128][2];
        for(int i = 0; i < s.length(); i++){
            char chr = s.charAt(i);
            arr[chr][0]++;
        }
        for(int i = 0; i < arr.length; i++){
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a,b) -> b[0] - a[0]);
        String ans = "";
        for(int i = 0; i < arr.length && arr[i][0] != 0; i++){
            for(int j = 0; j < arr[i][0]; j++){
                ans += (char)arr[i][1];
            }
        }
        
        return ans;
    }
}