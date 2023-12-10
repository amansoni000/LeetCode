class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix.length == 0){
            return matrix;
        }
        
        int[][] res = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length ;i++){
            for(int j = 0; j < matrix[i].length ; j++){
                res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}