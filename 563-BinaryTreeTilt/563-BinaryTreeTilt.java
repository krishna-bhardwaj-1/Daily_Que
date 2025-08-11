// Last updated: 12/08/2025, 00:17:18
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
    static int tilt;
    public int findTilt(TreeNode root) {
        tilt=0;
        helper(root);
        return tilt;
    }
    private int helper(TreeNode root){
        if(root==null) return 0;
        int left=helper(root.left);
        int right=helper(root.right);

        int ti=Math.abs(left-right);
        tilt+=ti;
        return left+right+root.val;
    }
}