class Solution {
    public int orangesRotting(int[][] grid) {
        int rotten = 0, fresh = 0, day = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2){
                    int[] temp = {i,j};
                    rotten++;
                    q.add(temp);
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        if(fresh == 0) return 0;
        int[][] direction = {{0,1}, {0,-1}, {1,0}, {-1,0}};
        while(!q.isEmpty()){
            int n = q.size();
            day++;
            for(int i = 0; i < n; i++){
                int[] temp = q.poll();
                for(int[] dir : direction){
                    int x = temp[0] + dir[0];
                    int y = temp[1] + dir[1];
                    if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == 2 || grid[x][y] == 0){
                        continue;
                    }
                    grid[x][y] = 2;
                    int[] new_rott = {x,y};
                    q.add(new_rott);
                    fresh--;
                }
            }
        }
        return fresh == 0 ? day - 1 : -1;
    }
}