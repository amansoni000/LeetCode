class Solution {
    int count = 0;
    public void helper(int[][] grid, int i, int j){
        if( i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) return;
        if(grid[i][j] == 1){
            grid[i][j] = 0;
            count+=1;
        }
        helper(grid, i+1, j);
        helper(grid, i-1, j);
        helper(grid, i, j-1);
        helper(grid, i, j+1);
        // up+down+right+left;
        // return
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    helper(grid, i , j);
                    max = Math.max(max, count);
                    count = 0;
                }
            }
        }
        return max;
    }
}