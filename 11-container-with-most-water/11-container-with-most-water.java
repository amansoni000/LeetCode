class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int flag1 = 0, flag2 = 0, max = 0;
        while( left < right){
            flag1 = 0;
            flag2 = 0;
            flag1 = height[left] < height[right] ? 1 : 0;
            flag2 = height[left] > height[right] ? 1 : 0;
            max = Math.max((right - left) * Math.min(height[left], height[right]), max);
            if(flag1 == 1 && flag2 == 0){
                left++;
            }
            else if(flag2 == 1 && flag1 == 0){
                right--;
            }
            else{
                left++;
                right--;
            }
        }
        return max;
    }
}