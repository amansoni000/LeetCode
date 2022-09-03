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
    int ans = Integer.MIN_VALUE;
    public int maxD(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = maxD(root.left);
        int right = maxD(root.right);
        ans = Math.max(ans, left + right);
        return 1 + Math.max(left, right);
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int len = maxD(root);
        return ans;
    }
}