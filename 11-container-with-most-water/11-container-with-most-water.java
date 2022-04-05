class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while( left < right){
            max = Math.max((right - left) * Math.min(height[left], height[right]), max);
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else{
                left++;
                right--;
            }
        }
        return max;
    }
}