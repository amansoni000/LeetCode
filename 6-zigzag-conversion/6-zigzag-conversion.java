class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        String ans = "";
        char[] arr = s.toCharArray();
        for(int i = 0; i < numRows; i++){
            int increment = 2*(numRows - 1);
            for(int j = i; j < arr.length; j += increment){
                ans += arr[j];
                if( i > 0 && i < numRows - 1 && j + increment - 2*i < arr.length){
                    ans += arr[j + increment - 2*i];
                }
            }
        }
        return ans;
    }
}