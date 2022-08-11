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
    TreeNode prev = null;
    boolean ans = true;
    public void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        
        if(prev != null && root.val <= prev.val){
            ans = false;
            return;
        }
        prev = root;
        
        helper(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        helper(root);
        return ans;
    }
}