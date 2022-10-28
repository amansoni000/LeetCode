class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 0;
        int[] arr = new int[k];
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Queue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        for(int key : map.keySet()){
            maxHeap.add(key);
        }
        while(k > 0){
            arr[arr.length - k] = maxHeap.poll();
            k--;
        }
        return arr;
    }
}