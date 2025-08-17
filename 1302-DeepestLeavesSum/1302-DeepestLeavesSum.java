// Last updated: 18/08/2025, 01:00:05
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
    static int maxlevel;
    static int sum;
    public int deepestLeavesSum(TreeNode root) {
        maxlevel=0;
        sum=0;
        helper(root,0);
        return sum;
    }

    public void helper(TreeNode root,int lvl){
        if(root==null) return;
        if(root.left==null && root.right==null){
            if(lvl>maxlevel){
                maxlevel=lvl;
                sum=root.val;
            }
            else if(lvl==maxlevel){
                sum+=root.val;
            }
        }
        helper(root.left,lvl+1);
        helper(root.right,lvl+1);
    }
}