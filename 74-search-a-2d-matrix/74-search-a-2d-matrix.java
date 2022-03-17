class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = 0;
        while(i < matrix.length && j < matrix[0].length){
            if(target > matrix[i][matrix[0].length - 1]){
                i++;
            }
            else if(target < matrix[i][matrix[0].length - 1 - j]){
                j++;
            }
            else{
                if(matrix[i][matrix[0].length - 1 - j] == target) return true;
                else return false;
            }
        }
        return false;
    }
}