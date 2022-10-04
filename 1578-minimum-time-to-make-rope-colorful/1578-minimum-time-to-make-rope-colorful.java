class Solution {
    public int minCost(String colors, int[] neededTime) {
        char[] color = colors.toCharArray();
        int i = 0, time = 0;
        while(i < color.length-1){
            if(color[i] == color[i+1]){
                int sum = 0, max = Integer.MIN_VALUE;
                while(i < color.length - 1 && color[i] == color[i+1]){
                    sum += neededTime[i];
                    max = Math.max(max, neededTime[i]);
                    i++;
                }
                sum += neededTime[i];
                max = Math.max(max, neededTime[i]);
                // System.out.println(sum + " " + max);
                time += sum - max;
            }
            else{
                i++;
            }
        }
        return time;
    }
}