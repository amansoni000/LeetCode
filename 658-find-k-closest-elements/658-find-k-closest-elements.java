class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int len = arr.length;
        int start = 0, end = len - k;
        while(start < end){
            int mid = (start + end)/2;
            if(x - arr[mid] > arr[mid+k] - x) start = mid+1;
            else end = mid;
        }
        for(int i = start; i < start + k; i++){
            list.add(arr[i]);
        }
        return list;
    }
}