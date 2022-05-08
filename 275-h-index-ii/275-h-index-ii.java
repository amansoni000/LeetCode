class Solution {
    public int hIndex(int[] citations) {
        int l = 0, h = citations.length - 1, len = citations.length - 1, mid = 0, ans = -1;
        while(l <= h){
            mid = (l + h)/2;
            if(citations[mid] <= len - mid){
                l = mid + 1;
                ans = len - mid;
            }
            if(citations[mid] > len - mid) h = mid - 1;
        }
        if(ans == -1) return len + 1;
        return ans;                                       
    }
}