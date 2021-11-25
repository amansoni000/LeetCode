class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ls = new ArrayList<int[]>();
        Arrays.sort(intervals,(i1,i2)->Integer.compare(i1[0], i2[0]));
        ls.add(intervals[0]);
        for(int i = 0; i < intervals.length; i++) {
            if(ls.get(ls.size()-1)[1]>=intervals[i][0]){
                 ls.get(ls.size() - 1)[1] = Math.max(ls.get(ls.size() - 1)[1], intervals[i][1]);
            }
            else{
                ls.add(intervals[i]);
            }
        }
        return ls.toArray(new int[ls.size()][]);

    }
}