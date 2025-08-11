// Last updated: 12/08/2025, 00:18:07
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
    static int ans;
    public int sumOfLeftLeaves(TreeNode root) {
        ans=0;
        helper(root);
        return ans;
    }
    private static void helper(TreeNode root){
        if(root==null) return;
        if(root.left!=null && root.left.left==null && root.left.right==null){
            ans+=root.left.val;
        }
        helper(root.left);
        helper(root.right);
    }
}