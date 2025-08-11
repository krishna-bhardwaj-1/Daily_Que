// Last updated: 12/08/2025, 00:17:35
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
    static int val;
    static int maxlevel;
    public int findBottomLeftValue(TreeNode root) {
        maxlevel=0;
        val=0;
        helper(root,1);
        return val;
    }
    private static void helper(TreeNode root,int level){
        if(root==null) return;

        if(maxlevel<level){
            val=root.val;
            maxlevel=level;
        }
        helper(root.left,level+1);
        helper(root.right,level+1);
    }

}