class Solution {
    public int lcs(String word1, String word2, int[][] dp, int i, int j){
        if(i == 0 || j==0){
            return 0;
        }
        if(dp[i][j] != -1) return dp[i][j]; 
        if(word1.charAt(i-1) == word2.charAt(j-1)){
            return dp[i][j] = 1 + lcs(word1, word2, dp, i-1, j-1);
        }
        else{
            return dp[i][j] = Math.max(lcs(word1, word2, dp, i, j-1), lcs(word1, word2, dp, i-1, j));
        }
    }
    public int minDistance(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        int[][] dp = new int[len1+1][len2+1];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        int max_lcs = lcs(word1, word2, dp, len1, len2);
        return len1+len2 - 2*max_lcs;
    }
}