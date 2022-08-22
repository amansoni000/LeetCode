class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stk.add(')');
            }
            else if(c == '{'){
                stk.add('}');
            }
            else if(c == '['){
                stk.add(']');
            }
            else if(stk.isEmpty() || stk.pop() != c){
                return false;
            }
        }
        return stk.isEmpty();
    }
}