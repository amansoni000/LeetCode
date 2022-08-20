class Solution {
    int count = 0;
    public void helper(int[][] image, int i, int j, int c, int x){
        if(i >= image.length || j >= image[0].length || i < 0 || j < 0 || image[i][j] == c || image[i][j] != x){
            return;
        }
        if(image[i][j] == x){
            image[i][j] = c;
        }
        helper(image, i + 1, j, c, x);
        helper(image, i - 1, j, c, x);
        helper(image, i , j + 1, c, x);
        helper(image, i , j - 1, c, x);        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        helper(image, sr, sc, color, image[sr][sc]);
        return image;
    }
}