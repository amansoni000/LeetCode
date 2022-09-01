class Solution {
    
    static int[] x = {1,0,-1,0};
    static int[] y = {0,-1,0,1};
    
    public static boolean dfs (int[][] grid, int i, int j) {
        if (i >= grid.length || i < 0 || j >= grid[i].length || j < 0) {
            return false;
        }
        if (grid[i][j] == 1) {
            return true;
        }
        grid[i][j] = 1;
        boolean result = true;
        boolean top = dfs (grid,i-1,j);
        boolean right = dfs(grid,i,j+1);
        boolean bottom = dfs(grid,i+1,j);
        boolean left = dfs(grid,i,j-1);
        return top && right && bottom && left;
    }
    
    public int closedIsland(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    boolean flag = dfs(grid,i,j);
                    if (flag) {
                        count += 1;
                    }
                }
            }
        }
        return count;
    }
}