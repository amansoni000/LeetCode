class Solution {
    public String removeDuplicates(String s, int k) {
        char[] arr = s.toCharArray();
        Stack<Character> stack_str = new Stack<>();
        Stack<Integer> stack_count = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            if(stack_str.size() > 0 && stack_str.peek() == arr[i]){
                int count = stack_count.peek();
                stack_count.pop();
                stack_count.push(count + 1);
            }
            else stack_count.push(1);
            stack_str.push(arr[i]);
            if(stack_count.peek() == k){
                for(int j = 0; j < k; j++) stack_str.pop();
                stack_count.pop();
            }
        }
        String str = "";
        for(int i = 0; i < stack_str.size(); i++) str += stack_str.elementAt(i);
        return str;
    }
}