class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        List<Integer> list_push = new ArrayList<>();
        int i = 0, j = 0;
        while((i < pushed.length && j < pushed.length) || list_push.size() > 0){
            if( (i < pushed.length && j < pushed.length) && pushed[i] == popped[j]){
                i++;
                j++;
            }
            else if(list_push.size() > 0 && list_push.get(list_push.size() - 1) == popped[j]){
                list_push.remove(list_push.size() - 1);
                j++;
            }
            else if((i < pushed.length && j < pushed.length) && pushed[i] != popped[j]){
                list_push.add(pushed[i]);
                i++;
            }
            else return false;
        }
        return true;
    }
}