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
    boolean ans = true;
    public void isSym(TreeNode x, TreeNode y){
        if(x == null && y == null) return;
        if(x == null || y == null || x.val != y.val){
            ans = false;
            return;
        }
        isSym(x.left, y.right);
        isSym(x.right, y.left);
        
    }
    public boolean isSymmetric(TreeNode root) {
        isSym(root, root);
        return ans;
    }
}