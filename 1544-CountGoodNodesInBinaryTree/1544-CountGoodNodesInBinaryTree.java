// Last updated: 12/08/2025, 00:14:42
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
    static int max;
    static int c;
    public int goodNodes(TreeNode root) {
        max=Integer.MIN_VALUE;
        c=0;
        helper(root,max);
        return c;
    }

    private void helper(TreeNode root,int max){
        if(root==null) return;
        if(root.val>=max){
            c++;
        }
        helper(root.left,Math.max(max,root.val));
        helper(root.right,Math.max(max,root.val));
    }
}