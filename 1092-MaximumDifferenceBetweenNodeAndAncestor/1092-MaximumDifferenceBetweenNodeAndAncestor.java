// Last updated: 12/08/2025, 00:15:48
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
    public int maxAncestorDiff(TreeNode root) {
        // int max=Integer.MIN_VALUE;
        // int minleft=min(root.left);
        // int maxleft=max(root.left);
        // max=Math.max(max,Math.max(Math.abs(root.val-minleft),Math.abs(root.val-maxleft)));
        // int minright=min(root.right);
        // int maxright=max(root.right);
        // max=Math.max(max,Math.max(Math.abs(root.val-minright),Math.abs(root.val-maxright)));
        // return max;
        return helper(root,root.val,root.val);
    }
    // private int max(TreeNode root){
    //     if(root==null){
    //         return Integer.MIN_VALUE;
    //     }
    //     int lft=max(root.left);
    //     int rgt=max(root.right);
    //     return Math.max(root.val,Math.max(lft,rgt));
    // }
    // private int min(TreeNode root){
    //     if(root==null){
    //         return Integer.MAX_VALUE;
    //     }
    //     int lft=min(root.left);
    //     int rgt=min(root.right);
    //     return Math.min(root.val,Math.min(lft,rgt));
    // }
    private int helper(TreeNode root,int min,int max){
        if(root==null) return max-min;
        min=Math.min(min,root.val);
        max=Math.max(max,root.val);

        int lft=helper(root.left,min,max);
        int rgt=helper(root.right,min,max);
        return Math.max(lft,rgt);
    }
}