class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int start = 1, end = piles[piles.length-1];
        int speed = 1, time=0;
        while(start<end){
            time =0;
            int mid = (start + end) /2;
            for(int i=0;i<piles.length;i++){
                time += Math.ceil((double)piles[i]/mid);
            }
            if(time>h) start = mid+1 ;
            else end = mid;
        }
        return end;
    }
}