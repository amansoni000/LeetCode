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
    boolean ans = false;
    public void solver(TreeNode root, int targetSum){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            if(targetSum - root.val == 0) ans = true;
            return;
        }
        solver(root.left, targetSum - root.val);
        solver(root.right, targetSum - root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        solver(root, targetSum);
        return ans;
    }
}