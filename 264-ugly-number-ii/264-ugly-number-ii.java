class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        int index2=0, index3=0, index5=0;
        int multi2=2, multi3=3, multi5=5;
        int min = Integer.MAX_VALUE;
        dp[0] = 1;
        for(int i=1;i<n;i++){
            min = Math.min(multi2,Math.min(multi3,multi5));
            dp[i] = min;
            if(min == multi2) multi2 = 2*dp[++index2];
            if(min == multi3) multi3 = 3*dp[++index3];
            if(min == multi5) multi5 = 5*dp[++index5];
        }
        return dp[n-1];
    }
}