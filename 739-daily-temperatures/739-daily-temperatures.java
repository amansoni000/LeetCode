class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> idx = new Stack<>();
        int[] ans = new int[temperatures.length];
        int i = ans.length;
        for(i = ans.length - 1; i >= 0; i--){
            if(stk.isEmpty()) ans[i] = 0;
            else{
                while(!stk.isEmpty() && stk.peek() <= temperatures[i]){
                    idx.pop();
                    stk.pop();
                }
                if(stk.isEmpty()) ans[i] = 0;
                else ans[i] = idx.peek() - i;;
            }
            stk.push(temperatures[i]);
            idx.push(i);
            // System.out.println(stk + " " + temperatures[i]);
        }
        return ans;
    }
}