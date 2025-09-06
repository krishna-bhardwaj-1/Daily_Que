// Last updated: 07/09/2025, 00:42:52
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
    public int sumEvenGrandparent(TreeNode root) {
        return helper(root,0,0);
    }
    private int helper(TreeNode root,int gp,int p){
        if(root==null){
            return 0;
        }
        int l=helper(root.left,p,root.val);
        int r=helper(root.right,p,root.val);
        int ans=l+r;
        if(gp%2==0 && gp!=0){
            ans+=root.val;
        }
        return ans;
    }
}