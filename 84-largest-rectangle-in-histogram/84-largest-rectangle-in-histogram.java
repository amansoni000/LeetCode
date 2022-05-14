class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> idx = new Stack<>();
        int i = 0, maxArea = Integer.MIN_VALUE, last_idx = -1;
        while(i < heights.length){
            last_idx = -1;
            while(!stack.isEmpty() && heights[i] <= stack.peek()){
                maxArea = Math.max(maxArea, stack.pop()*(i - idx.peek()));
                last_idx = idx.pop();
            }
            stack.push(heights[i]);
            if(last_idx != -1) idx.push(last_idx);
            else idx.push(i);
            i++;
            
        }
        int len = heights.length;
        while(!stack.isEmpty()){
            maxArea = Math.max(stack.pop()*(len - idx.pop()), maxArea);
        }
        return maxArea;
    }
}