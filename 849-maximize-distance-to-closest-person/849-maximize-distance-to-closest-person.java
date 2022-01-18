class Solution {
    public int maxDistToClosest(int[] seats) {
        int total = seats.length;
        int start = 0, end = total-1, ones=0, first =-1;
        int max_dist = -1;
        for(int i=0;i<total;i++){
            if(seats[i]==1){
                ones++;
                max_dist = Math.max(i-start,max_dist);
                if(start==0 && seats[0]==0) first = i;
                start = i;
            }
        }
        if(ones==1){
            return Math.max(start,end-start);
        }
        if(end-start>max_dist/2 && start!=end){
            return end-start;
        }
        return Math.max(max_dist/2,first);
    }
}