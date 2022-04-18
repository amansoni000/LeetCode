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
    int ans = 0, i = 1;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;
        int left = kthSmallest(root.left, k);
        if(i == k) ans = root.val;
        i++;
        int right = kthSmallest(root.right, k);
        return ans;
    }
}