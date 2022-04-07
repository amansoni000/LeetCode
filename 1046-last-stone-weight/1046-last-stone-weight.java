class Solution {
    public int lastStoneWeight(int[] stones) {
        int len = stones.length;
        Arrays.sort(stones);
        if(len == 1) return stones[0];
        if(len == 2){
            if(stones[len - 1] == stones[len - 2]) return 0;
            else return stones[len - 1] - stones[len - 2];
        }
        while(stones[len - 2] != 0){
            if(stones[len - 1] == stones[len - 2]){
                stones[len - 1] = 0;
                stones[len - 2] = 0;
            }
            else{
                stones[len - 1] = stones[len - 1] - stones[len - 2];
                stones[len - 2] = 0;
            }
            Arrays.sort(stones);
        }
        return stones[len - 1];
    }
}