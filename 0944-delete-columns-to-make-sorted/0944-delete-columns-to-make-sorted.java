class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length, len = strs[0].length(), last = Integer.MIN_VALUE, count = 0;
        for(int i = 0; i < len; i++){
            last = strs[0].charAt(i);
            for(int j = 0; j < n; j++){
                if(strs[j].charAt(i) >= last){
                    last = strs[j].charAt(i);
                }
                else{
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}