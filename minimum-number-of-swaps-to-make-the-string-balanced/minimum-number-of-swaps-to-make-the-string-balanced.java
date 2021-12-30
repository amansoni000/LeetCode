class Solution {
    public int minSwaps(String s) {
        int close = 0, max_close = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==']'){
                close++;
            }
            else{
                close--;
            }
            max_close = Math.max(max_close,close);
        }
        return (max_close+1)/2;
    }
}