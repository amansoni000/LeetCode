class Solution {
    public int countPrimes(int n) {
        boolean[] dp = new boolean[n];
        for (int i = 2; i < n; i++) {
            dp[i] = true;
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(dp[i] && (long)i*i <n){
                for(int j= i*i;j<n;j+=i){
                    dp[j] = false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(dp[i]){
                count++;
            }
        }
        return count;
    }
}