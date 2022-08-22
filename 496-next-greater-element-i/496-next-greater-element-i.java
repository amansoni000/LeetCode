class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stk = new Stack<>();
        int[] arr = new int[nums1.length];
        for(int i = nums2.length - 1; i >= 0; i--){
            if(stk.isEmpty()) map.put(nums2[i], -1);
            else{
                while(!stk.isEmpty() && stk.peek() < nums2[i]) stk.pop();
                if(!stk.isEmpty()) map.put(nums2[i], stk.peek());
                else map.put(nums2[i], -1);
            }
            stk.push(nums2[i]);
        }
        for(int i = 0; i < nums1.length; i++){
            arr[i] = map.get(nums1[i]);
        }
        return arr;
    }
}