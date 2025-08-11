// Last updated: 12/08/2025, 00:12:09
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
    public boolean checkTree(TreeNode root) {
        if(root==null|| root.left==null || root.right==null||root.left.val+root.right.val!=root.val) return false;
        
        checkTree(root.left);
        checkTree(root.right);
        return true;
    }
}