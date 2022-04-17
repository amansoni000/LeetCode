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
    TreeNode newroot = new TreeNode(-1);
    public void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        newroot.right = new TreeNode(root.val);
        newroot.left = null;
        newroot = newroot.right;
        helper(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = newroot;
        helper(root);
        return ans.right;
    }
}