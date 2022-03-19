class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        int i = 0, j  = 0, r1 = 1, c1 = 0;
        boolean flag = true;
        while(r > 0 && c > 0){
            if(j >= c) flag = false;
            while(j < c && flag){
                list.add(matrix[i][j]);
                j++;
            }
            j--;
            i++;
            if(i >= r) flag = false;
            while( i < r && flag){
                list.add(matrix[i][j]);
                i++;
            }
            i--;
            j--;
            if(c1 > j) flag = false;
            while(c1 <= j && flag){
                list.add(matrix[i][j]);
                j--;
            }
            j++;
            i--;
            if(r1 > i) flag = false;
            while(r1 <= i && flag){
                list.add(matrix[i][j]);
                i--;
            }
            i++;
            j++;
            r--;
            c--;
            r1++;
            c1++;
        }
        return list;
    }
}