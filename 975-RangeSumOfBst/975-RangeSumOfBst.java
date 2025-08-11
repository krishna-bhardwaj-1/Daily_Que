// Last updated: 12/08/2025, 00:16:08
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
    static int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        helper(root,low,high);
        return sum;
    }
    public static void helper(TreeNode root,int low,int high){
        if(root==null){
            return;
        }
        if(root.val<low){
            helper(root.right,low,high);
        }
        else if(root.val>high){
            helper(root.left,low,high);
        }
        else{
            sum+=root.val;
            helper(root.left,low,high);
            helper(root.right,low,high);
        }
    }
}