class Solution {
    public void fill(int[][] grid, int i, int j){
        int row = grid.length, col = grid[0].length;
        if(i < 0 || j < 0 || i >= row || j >= col || grid[i][j] == 1) return;
        if(grid[i][j] == 0) grid[i][j] = 1;
        int[][] dir = {{1,0}, {0,1}, {-1,0}, {0,-1}};
        for(int k = 0; k < 4; k++){
            fill(grid, i + dir[k][0], j + dir[k][1]);
        }
    }
    public int closedIsland(int[][] grid) {
        int row = grid.length, col = grid[0].length, count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(i == 0 || j == 0 || i == row-1 || j == col - 1){
                    if(grid[i][j] == 0) fill(grid, i, j);
                }
            }
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 0){
                    count+= 1;
                    fill(grid, i, j);
                }
            }
        }
        return count;
    }
}