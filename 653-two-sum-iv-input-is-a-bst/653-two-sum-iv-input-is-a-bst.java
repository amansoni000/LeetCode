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
    HashSet<Integer> set = new HashSet<>();
    boolean ans = false;
    int val;
    public void helper(TreeNode root){
        if(root == null) return;
        if(set.contains(val - root.val)){
            ans = true;
        }
        set.add(root.val);
        helper(root.left);
        helper(root.right);
        return;
    }
    public boolean findTarget(TreeNode root, int k) {
        val = k;
        helper(root);
        return ans;
    }
}