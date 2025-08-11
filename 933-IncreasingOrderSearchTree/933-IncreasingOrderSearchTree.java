// Last updated: 12/08/2025, 00:16:18
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
    static TreeNode nn;
    public TreeNode increasingBST(TreeNode root) {
        nn=new TreeNode(-1);
        TreeNode temp=nn;
        inorder(root); 
        return temp.right;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        TreeNode dummy=new TreeNode(root.val);
        nn.right=dummy;
        nn=nn.right;
        inorder(root.right);
    }
}