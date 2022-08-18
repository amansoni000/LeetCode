class Solution {
    public int minSetSize(int[] arr) {
        int[][] joined = new int[arr.length][2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int i = 0, ans = 0, remove = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            joined[i][0] = entry.getKey();
            joined[i][1] = entry.getValue();
            i++;
        }
        Arrays.sort(joined, (a,b) -> b[1] - a[1]);
        i = 0;
        while(i < arr.length){
            while(i < arr.length && joined[i][0] == 0) i++;
            if(i < arr.length && remove < arr.length/2){
                ans += 1;
                remove += joined[i][1];
            }
            i++;
        }
        return ans;
    }
}