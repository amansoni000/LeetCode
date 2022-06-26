class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        int leftsum = 0, rightsum = 0;
        for(int i = 0; i < k; i++){
            leftsum += cardPoints[i];
        }
        
        int ans = leftsum;
        
        for(int i = 0; i < k ; i++){
            leftsum -= cardPoints[k-i-1];
            rightsum += cardPoints[len-i-1];
            ans = Math.max(leftsum + rightsum, ans);
        }
        return ans;
    }
}