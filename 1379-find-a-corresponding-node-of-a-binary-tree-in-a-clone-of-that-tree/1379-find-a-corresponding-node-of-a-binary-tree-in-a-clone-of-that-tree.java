/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans = null;
    public void traverse(TreeNode original, TreeNode cloned, TreeNode target){
        if(cloned == null || original == null) return;
        if(original == target) ans = cloned;
        traverse(original.left, cloned.left, target);
        traverse(original.right, cloned.right, target);
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        traverse(original, cloned, target);
        return ans;
    }
}