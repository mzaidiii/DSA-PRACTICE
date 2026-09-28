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
    public int goodNodes(TreeNode root) {
        return check(root, root.val);
    }

    private int check(TreeNode root, int maxSoFar) {

        if (root == null) {
            return 0;
        }

        int count = 0;

        if (root.val >= maxSoFar) {
            count = 1;
        }

        int newMax = Math.max(maxSoFar, root.val);

        int left = check(root.left, newMax);
        int right = check(root.right, newMax);

        return count + left + right;
    }
}