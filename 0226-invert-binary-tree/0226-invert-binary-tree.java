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
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private void invert(TreeNode root) {
        if (root == null)
            return;
        invert(root.left);
        invert(root.right);
        swap(root);
    }

    private TreeNode swap(TreeNode current ){
        if(current.left == null && current.right == null) return current ; 
        TreeNode temp = current.left ;
        current.left = current.right ;
        current.right = temp ;
        return current ; 
    }
}