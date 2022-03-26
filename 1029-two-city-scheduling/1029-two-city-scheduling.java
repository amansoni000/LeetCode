class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a,b) -> Integer.compare(b[1] - b[0], a[1] - a[0]));
        int n = costs.length/2;
        int ans = 0;
        for(int i = 0 ; i < costs.length; i++){
            if(i < n) ans += costs[i][0];
            else ans += costs[i][1];
        }
        // for(int i = 0 ; i < costs.length; i++){
        //     System.out.print(" [" + costs[i][0] + "," + costs[i][1] + "] ");
        // }
        return ans;
    }
}