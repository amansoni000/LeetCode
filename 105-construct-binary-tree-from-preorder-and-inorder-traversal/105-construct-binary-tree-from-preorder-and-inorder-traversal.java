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
    int pos = 0;
    public TreeNode helper(int[] preorder, int[] inorder, int mid, int end, HashMap<Integer, Integer> map){
        if(mid > end){
            return null;
        }
        TreeNode root = new TreeNode(preorder[pos]);
        int idx = map.get(preorder[pos]);
        pos++;
        root.left = helper(preorder, inorder, mid, idx - 1, map);
        root.right = helper(preorder, inorder, idx + 1, end, map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return helper(preorder, inorder, 0, inorder.length - 1, map);
    }
}