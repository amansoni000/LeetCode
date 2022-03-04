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
    public TreeNode helper(int[] inorder, int[] postorder, int mid, int n, HashMap<Integer, Integer> map){
        // System.out.println(pos);
        if(mid > n){
            return null;
        }
        TreeNode root = new TreeNode(postorder[pos--]);
        int idx = map.get(root.val);
        root.right = helper(inorder, postorder, idx + 1, n, map);
        root.left = helper(inorder, postorder, mid, idx - 1, map);
        return root;
        
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        pos = postorder.length - 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        TreeNode root = helper(inorder, postorder, 0,  inorder.length-1, map);
        return root;
    }
}