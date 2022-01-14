class Solution {
    public int findPairs(int[] arr, int n) {
        Arrays.sort(arr);
        int count=0, size = arr.length;
        int start = 0, end = 1;
        while(start < size && end < size){
            if(arr[end] - arr[start] == n && start!=end){
                count++;
                start++;
                end++;
                while(end<arr.length && arr[end]==arr[end-1])
                {
                    end++;
                }
            }
            else if(arr[end] - arr[start] > n) start++;
            else if(arr[end] - arr[start] < n) end++;
            if(start==end) end++;
        }
        return count;
    }
}