class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("+", 1);
        map.put("-", 2);
        map.put("*", 3);
        map.put("/", 4);
        for(int i = 0; i < tokens.length; i++){
            if(map.containsKey(tokens[i])){
                int x = stack.pop();
                int y = stack.pop();
                int op = map.get(tokens[i]);
                if(op == 1) stack.push(y + x);
                else if(op == 2) stack.push(y - x);
                else if(op == 3) stack.push(y * x);
                else if(op == 4) stack.push(y / x);
            }
            else{
                int val = Integer.parseInt(tokens[i]);
                stack.push(val);
            }
        }
        return stack.pop();
    }
}