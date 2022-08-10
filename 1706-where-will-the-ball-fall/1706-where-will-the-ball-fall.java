class Solution {
    public int helper(int[][] grid, int col){
        int i = 0, j = col;
        while( i < grid.length && j >= 0 && j < grid[0].length){
            if(grid[i][j] == 1){
                if( (j + 1) < grid[0].length && grid[i][j+1] == 1){
                    i += 1;
                    j += 1;
                }
                else break;
            }
            else if(grid[i][j] == -1){
                if( (j - 1) >= 0 && grid[i][j-1] == -1){
                    i += 1;
                    j -= 1;
                }
                else break;
            }
        }
        if( i >= grid.length && j >= 0 && j < grid[0].length) return j;
        else return -1;
    }
    public int[] findBall(int[][] grid) {
        int col = grid[0].length;
        int[] arr = new int[col];
        for(int i = 0; i < col; i++){
            arr[i] = helper(grid, i);
        }
        return arr;
    }
}