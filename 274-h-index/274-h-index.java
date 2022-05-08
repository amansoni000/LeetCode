class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int max = -1, j = 0;
        for(int i = citations.length - 1; i >=0; i--){
            if(citations[i] <= j){
                max = j;
                break;
            }
            j++;
        }
        if(max == -1) return citations.length;
        return max;
    }
}