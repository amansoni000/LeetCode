class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int idx=0, oil=0, left=0;
        for(int i=0;i<cost.length;i++){
            oil += gas[i]-cost[i];
            if(oil<0){
                left+=oil;
                oil=0;
                idx=i+1;
            }
        }
        return oil+left>=0 ? idx : -1 ;
    }
}