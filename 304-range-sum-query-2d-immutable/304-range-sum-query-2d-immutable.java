class NumMatrix {
    int[][] arr;
    public NumMatrix(int[][] matrix) {
        int run_sum = 0;
        arr = matrix;
        for(int i = 0; i < matrix.length; i++){
            run_sum = 0;
            for(int j = 0; j < matrix[0].length; j++){
                run_sum += matrix[i][j];
                arr[i][j] = run_sum;
            }
        }
        // for(int i = 0; i < matrix.length; i++){
        //     run_sum = 0;
        //     for(int j = 0; j < matrix[0].length; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int i = row1; i <= row2; i++){
            if(col1 > 0){
                sum += (arr[i][col2] - arr[i][col1 - 1]);
            }
            else sum += arr[i][col2];
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */