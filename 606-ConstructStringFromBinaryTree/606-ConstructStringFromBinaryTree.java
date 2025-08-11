// Last updated: 12/08/2025, 00:17:12
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
    public String tree2str(TreeNode root) {
        StringBuilder s=new StringBuilder();
        helper(root,s);
        return s.toString();
    }
    private void helper(TreeNode root,StringBuilder s){
        if(root==null) return;
        if(root.left==null && root.right==null){
            s.append(root.val);
            return;
        }
        s.append(root.val);
        
        if(root.left!=null || root.right!=null){
            s.append("(");
            helper(root.left,s);
            s.append(")");
        }
        
        if(root.right!=null){
            s.append("(");
            helper(root.right,s);
            s.append(")");
        }
    }
}