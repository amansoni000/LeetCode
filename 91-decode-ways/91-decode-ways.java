class Solution {
    public int solver(String s, int idx, int[] dp){
        if(idx == s.length()) return 1;
        if(s.charAt(idx) == '0') return 0;
        if(dp[idx] != -1) return dp[idx];
        int single_way = solver(s, idx+1, dp);
        int double_way = 0;
        if(idx+1 < s.length() && s.charAt(idx) != '0' && Integer.parseInt(s.substring(idx, idx+2)) <= 26){
            double_way = solver(s, idx + 2, dp);
        }
        dp[idx] = single_way + double_way;
        return dp[idx];
    }
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        Arrays.fill(dp, -1);
        return solver(s, 0, dp);
    }
}