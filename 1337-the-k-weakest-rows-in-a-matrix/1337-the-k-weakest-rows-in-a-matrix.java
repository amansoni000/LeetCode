class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<List<Integer>> list = new ArrayList<>();
        int[] arr = new int[k];
        for(int i = 0; i < mat.length; i++){
            int start = 0;
            int end = mat[i].length;
            int mid = (start + end)/2;
            while(start < end){
                mid = (start + end)/2;
                if(mat[i][mid] == 0) end = mid;
                if(mat[i][mid] == 1) start = mid + 1;
            }
            List<Integer> temp = new ArrayList<>();
            temp.add(i);
            if(mat[i][mid] == 1) temp.add(mid+1);
            else temp.add(mid);
            list.add(temp);
        }
        Collections.sort(list, (a,b) -> a.get(1) - b.get(1) ==  0 ? a.get(0) - b.get(0) : a.get(1) - b.get(1));
        for(int i = 0; i < k; i++){
            arr[i] = list.get(i).get(0);
        }
        return arr;
    }
}