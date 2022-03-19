class Solution {
    public void swap(int[][] matrix){
        int len = matrix.length;
        int i = 0;
        while((len/2) > i){
            int j = 0;
            while(j < len){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len - 1 - i][j];
                matrix[len - 1 - i][j] = temp;;
                j++;
            }
            i++;
        }
    }
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        swap(matrix);
        for(int i = 0; i < len; i++){
            for(int j = i; j < len; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}