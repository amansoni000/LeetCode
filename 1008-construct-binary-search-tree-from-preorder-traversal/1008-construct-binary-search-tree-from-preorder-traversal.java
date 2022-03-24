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
    int mid = 1;
    void helper(int[] preorder, TreeNode root, int start, int end){
        if(start <= end){
            int i = start, mid = start;
            while(preorder[i] < root.val && i < preorder.length){
                mid++;
                i++;
            }
            TreeNode temp1 = new TreeNode(preorder[start]);
            if(start != mid) root.left= temp1;
            else root.left = null;
            
            helper(preorder, root.left, start+1, mid);
            TreeNode temp2 = new TreeNode(preorder[mid]);
            
            if(mid != end) root.right= temp2;
            else root.right = null;
            
            helper(preorder, root.right, mid + 1, end);
            
        }
        else return;
    }
    public TreeNode bstFromPreorder(int[] preorder1) {
        int[] preorder = new int[preorder1.length + 1];
        for(int i = 0; i < preorder1.length; i++){
            preorder[i] = preorder1[i];
        }
        preorder[preorder1.length] = 10001;
        TreeNode root = new TreeNode(preorder[0]);
        helper(preorder, root, 1, preorder.length - 1);
        return root;
    }
}