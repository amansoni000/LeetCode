class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int[] top_count = new int[7];
        int[] bottom_count = new int[7];
        int max = 0, max_top = 0, max_bottom = 0, temp = 0, count = Integer.MAX_VALUE;
        boolean flag = true;
        for(int i = 0; i < tops.length; i++){
            top_count[tops[i]]++;
        }
        for(int i = 0; i < bottoms.length; i++){
            bottom_count[bottoms[i]]++;
        }
        while(true){
            for(int i = 1; i < top_count.length; i++){
                if(top_count[i] > max){
                    max = top_count[i];
                    max_top = i;
                }
            }
            if(max == 0) break;
            max = 0;
            top_count[max_top] = 0;
            for(int i = 0; i < tops.length; i++){
                if(tops[i] != max_top){
                    if(bottoms[i] == max_top){
                        temp++;
                        flag = true;
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) count = Math.min(temp, count);
        }
        temp = 0;
        while(true){
            for(int i = 1; i < bottom_count.length; i++){
                if(bottom_count[i] > max){
                    max = bottom_count[i];
                    max_bottom = i;
                }
            }
            if(max == 0) break;
            max = 0;
            bottom_count[max_bottom] = 0;
            for(int i = 0; i < bottoms.length; i++){
                if(bottoms[i] != max_bottom){
                    if(tops[i] == max_bottom){
                        temp++;
                        flag = true;
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) count = Math.min(temp, count);
        }
        if(count == Integer.MAX_VALUE) return -1;
        return count;
    }
}