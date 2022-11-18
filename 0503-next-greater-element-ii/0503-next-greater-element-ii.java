class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> idx = new Stack<>();
        int[] vis = new int[nums.length];
        Arrays.fill(vis, Integer.MAX_VALUE);
        stk.push(nums[0]);
        idx.push(0);
        for(int j = 1; j < nums.length*2; j++){
            int i = j%nums.length;
            while(!stk.isEmpty() && nums[i] > stk.peek()){
                // System.out.println(stk.peek() + "  : " + nums[i]);
                vis[idx.pop()] = nums[i];
                stk.pop();
                // idx.pop()
            }
            if(vis[i] == Integer.MAX_VALUE){
                stk.push(nums[i]);
                idx.push(i);
            }
        }
        while(!stk.isEmpty()){
            // System.out.println(stk.pop() + "  : " + -1);
            vis[idx.pop()] = -1;
            stk.pop();
        }
        return vis;
    }
}