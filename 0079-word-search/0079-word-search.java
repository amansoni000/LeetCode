class Solution {
    boolean ans = false;
    public void helper(char[][] board, char[] arr, int i, int j, int index, boolean[][] visited){
        // if(index < arr.length && i < board.length && j < board[0].length && i >=0 && j >= 0) System.out.println(arr[index] + " " + board[i][j] + " " + index);
        // System.out.println(index+ "  " + i+""+j);
        if(index == arr.length){
            ans = true;
            return;
        }
        if(arr[index] != board[i][j] || visited[i][j] == true){
            return;
        }
        visited[i][j] = true;
        if(i < board.length - 1)     helper(board, arr, i+1, j, index + 1, visited);
        if(i > 0)                    helper(board, arr, i-1, j, index + 1, visited);
        if( j < board[0].length - 1) helper(board, arr, i, j+1, index + 1, visited);
        if(j > 0)                    helper(board, arr, i, j-1, index + 1, visited);
        visited[i][j] = false;
    }
    public boolean exist(char[][] board, String word) {
        char[] arr = word.toCharArray();
        boolean[][] visited  = new boolean[board.length][board[0].length];
        if(word.length() == 1){
            if(word.charAt(0) == board[0][0]) return true;
        }
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                helper(board, arr, i, j, 0, visited);
                // System.out.println(visited[i][j]);
                if(ans == true) return true;
            }
        }
        return ans;
    }
}