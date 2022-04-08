class KthLargest {
    ArrayList<Integer> list = new ArrayList<>();
    int target;
    public KthLargest(int k, int[] nums) {
        for(int i : nums){
            list.add(i);
        }
        target = k;
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size() - target);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */