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
    public void traverse(TreeNode cloned, int value){
        if(cloned == null) return;
        // System.out.println(cloned.val + " ");
        if(cloned.val == value) ans = cloned;
        traverse(cloned.left, value);
        traverse(cloned.right, value);
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        int value = target.val;
        traverse(cloned, value);
        return ans;
    }
}