class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int rows = text1.length()+1;
        int cols = text2.length()+1;
        int[][] arr = new int[rows][cols];
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+1;
                }
                else{
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
                }
            
            }
        }
        return arr[rows-1][cols-1];
    }
}