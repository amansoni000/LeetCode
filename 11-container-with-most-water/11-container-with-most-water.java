class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0, ans = 0;
        while( left < right){
            if(height[left] <= height[right]){
                ans = (right - left)*height[left];
                left++;
            }
            else if(height[left] > height[right]){
                ans = (right - left)*height[right];
                right--;
            }
            if(ans > max) max = ans;
        }
        return max;
    }
}