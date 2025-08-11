// Last updated: 12/08/2025, 00:19:56
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
    public int sumNumbers(TreeNode root) {
        sum=0;
        sumtree(root,0);
        return sum;
    }
    private void sumtree(TreeNode root,int ans){
        if(root==null) return;

        if(root.left==null && root.right==null){
            sum+=ans*10+root.val;
        }
        sumtree(root.left,ans*10+root.val);
        sumtree(root.right,ans*10+root.val);
    }
}