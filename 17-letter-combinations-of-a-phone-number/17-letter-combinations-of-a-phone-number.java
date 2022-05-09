class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        HashMap<Character, String> map = new HashMap<>();
        Stack<String> stack = new Stack<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        int i = 0;
        while(i < digits.length()){
            String s = map.get(digits.charAt(i));
            if(stack.size() == 0){
                for(int j = 0; j < s.length(); j++){
                    String temp = "" + s.charAt(j);
                    stack.add(temp);
                }
            }
            else{
                Stack<String> temp_stack = new Stack<>();
                while(!stack.isEmpty()){
                    for(int j = 0; j < s.length(); j++) temp_stack.push(stack.peek() + s.charAt(j));
                    stack.pop();
                }
                stack = temp_stack;
            } 
            i++;
        }
        while(!stack.isEmpty()){
            ans.add(stack.pop());
        }
        return ans;
    }
}