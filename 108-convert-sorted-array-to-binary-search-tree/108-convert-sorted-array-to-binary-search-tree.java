/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode gototree(int[] nums, int l, int r){
        if(l <= r){
            int mid = (l+r)/2;
            TreeNode temp = new TreeNode(nums[mid]);
            temp.left = gototree(nums, l, mid - 1);
            temp.right = gototree(nums, mid + 1, r);
            return temp;
        }
        return null;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return gototree(nums, 0, nums.length - 1);
    }
}