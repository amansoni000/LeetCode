class Solution {
public:
    int rob(vector<int>& nums) {
        int len = nums.size();
        int dp[len+2];
        if(len == 1) return nums[0];
        int j = 2;
        for(int i = 0; i < len+2; i++){
            dp[i] = 0;
        }
        for(int i = 1; i < nums.size(); i++){
            dp[j] = max(dp[j-2] + nums[i], dp[j-1]);
            j++;
        }
        int ans1 = dp[len];
        j = 2;
        for(int i = 0; i < len+2; i++){
            dp[i] = 0;
        }
        for(int i = 0; i < nums.size()-1; i++){
            dp[j] = max(dp[j-2] + nums[i], dp[j-1]);
            j++;
        }
        return max(ans1, dp[len]);
    }
};