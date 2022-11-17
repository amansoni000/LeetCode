class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int max = (ax2-ax1)*(ay2-ay1) + (bx2-bx1)*(by2-by1);
        if((bx1 >= ax2) || (bx2 <= ax1) || (by2 <= ay1) || (by1 >= ay2)) return max;
        else{
            // calculate x overlap
            int left = Math.max(ax1, bx1);
            int right = Math.min(ax2, bx2);
            int x = right - left;

             // calculate y overlap
            int top = Math.min(ay2, by2);
            int bottom = Math.max(ay1, by1);
            int y = top - bottom;
            max -= x*y;
        }
        return max;
    }
}