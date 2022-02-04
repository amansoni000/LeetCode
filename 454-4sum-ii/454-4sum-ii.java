class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int len = nums1.length, result = 0;
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                hm.put(nums1[i] + nums2[j], hm.getOrDefault(nums1[i] + nums2[j],0)+1);
            }
        }
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                result += hm.getOrDefault(-(nums3[i] + nums4[j]), 0);
            }
        }
        return result;
    }
}