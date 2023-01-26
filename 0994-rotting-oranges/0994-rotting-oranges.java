class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        int m = grid.length, n = grid[0].length, fresh = 0, rotten = 0, time = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    fresh += 1;
                }
                else if(grid[i][j]  == 2){
                    rotten += 1;
                    Pair<Integer, Integer> pair = new Pair<>(i,j);
                    q.add(pair);
                }
            }
        }
        if(fresh == 0) return time;
        if(rotten == 0) return -1;
        
        int[] dir = {0,1,0,-1,0};
        System.out.println(q);
        while(!q.isEmpty()){
            int size = q.size();
            time++;
            for(int j = 0 ; j < size; j++){
                Pair<Integer, Integer> pair = q.remove();
                int old_row = pair.getKey();
                int old_col = pair.getValue();
                System.out.println(q);
                for(int i = 0; i < 4; i++){
                    int new_row = old_row + dir[i];
                    int new_col = old_col + dir[i+1];
                    if(new_row >= 0 && new_col >= 0 && new_row < m && new_col < n && grid[new_row][new_col] == 1){
                        System.out.println(new_row + " " + new_col);
                        grid[new_row][new_col] = 2;
                        fresh--;
                        q.add(new Pair<>(new_row, new_col));
                    }
                }
            }
        }
        return fresh == 0 ? time-1 : -1;
        
    }
}