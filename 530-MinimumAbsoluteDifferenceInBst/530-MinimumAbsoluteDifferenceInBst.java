// Last updated: 12/08/2025, 00:17:29
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
    static int prev;
    static int mindiff;
    public int getMinimumDifference(TreeNode root) {
        prev=-1;
        mindiff=Integer.MAX_VALUE;
        inorder(root);
        return mindiff;
    }

    private void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=-1){
            mindiff=Math.min(mindiff,Math.abs(root.val-prev));
        }
        prev=root.val;
        inorder(root.right);
    }
}