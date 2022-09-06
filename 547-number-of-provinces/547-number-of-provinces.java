class Solution {
    public int findCircleNum(int[][] isConnected) {
        int row = isConnected.length, col = isConnected[0].length;
        boolean[] vis = new boolean[row];
        int count = 0;
        for(int i = 0; i < row; i++){
            if(vis[i] == false){
                count += 1;
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = true;
                while(!q.isEmpty()){
                    int city = q.remove();
                    for(int j = 0; j < row; j++){
                        if(isConnected[city][j] == 1 && city != j && vis[j] == false){
                            vis[j] = true;
                            q.add(j);
                        }
                    }
                }
            }
        }
        return count;
    }
}