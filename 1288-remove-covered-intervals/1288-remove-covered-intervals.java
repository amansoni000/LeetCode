class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (int[] num1,int[] num2)->(num1[0] == num2[0] ? Integer.compare(num2[1],num1[1]) : Integer.compare(num1[0],num2[0])));
        int count = 0, last = -1;
        for(int i=0; i<intervals.length; i++){
            if(intervals[i][1] <= last){
                count++;
            }
            else{
                last = intervals[i][1];
            }
        }
        return intervals.length - count;
    }
}