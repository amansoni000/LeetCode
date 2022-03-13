class Solution {
    public boolean isValid(String s) {
        List<Character> list = new ArrayList<>();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ')' && list.size() > 0 && list.get(list.size() - 1) == '(' ){
                list.remove(list.size() - 1);
            }
            else if(arr[i] == '}' && list.size() > 0 && list.get(list.size() - 1) == '{' ){
                list.remove(list.size() - 1);
            }
            else if(arr[i] == ']' &&  list.size() > 0 && list.get(list.size() - 1) == '[' ){
                list.remove(list.size() - 1);
            }
            else if(arr[i] == '(' || arr[i] == '{' || arr[i] == '['){
                list.add(arr[i]);
            }
            else{
                return false;
            }
        }
        if(list.size() == 0) return true;
        return false;
    }
}