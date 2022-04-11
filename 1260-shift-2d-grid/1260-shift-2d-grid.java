class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list = new ArrayList<>();
        int size = (grid.length)*(grid[0].length), temp = 0;
        k %= size;
        for(int i = 0; i < k; i++){
            int first = grid[0][0];
            int last = grid[grid.length - 1][grid[0].length - 1];
            for(int j = 0; j <= grid.length - 1; j++){
                for(int l = 0; l < grid[0].length - 1; l++){
                    temp = grid[j][l + 1];
                    grid[j][l + 1] = first;
                    first = temp;
                }
                if(j != grid.length - 1){
                    temp = grid[j + 1][0];
                    grid[j + 1][0] = first;
                    first = temp;
                }
            }
            grid[0][0] = last;
        }
        for(int j = 0; j < grid.length; j++){
            List<Integer> temp_list = new ArrayList<>();
            for(int l = 0; l < grid[0].length; l++){
                temp_list.add(grid[j][l]);
            }
            list.add(temp_list);
        }
        return list;
    }
}