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
    public TreeNode solver(int[] nums, int l, int r){
        if(l < 0 || r >= nums.length || r < l) return null;
        int idx = -1, max = -1;
        for(int i = l; i <= r; i++){
            if(nums[i] > max){
                max = nums[i];
                idx = i;
            }
        }
        // System.out.println(idx + " " + max + " " + l + r);
        TreeNode root = new TreeNode(nums[idx]);
        root.left = solver(nums, l, idx-1);
        root.right = solver(nums, idx + 1, r);
        return root;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return solver(nums, 0, nums.length-1);
    }
}