class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        ArrayList<Integer> ls = new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++){
            h1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(h1.contains(nums2[i])){
                h2.add(nums2[i]);
            }
        }
        int[] arr = new int[h2.size()];
        int j=0;
        for(int number : h2){
            arr[j] = number;
            j++;
        }
        return arr;
        
    }
}