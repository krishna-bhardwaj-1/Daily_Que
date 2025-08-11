// Last updated: 12/08/2025, 00:19:01
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
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode temp=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(temp);
        return root;
    }
    // private void invert(TreeNode root){
    //     if(root==null || (root.left==null && root.right==null)) return;
    //     invert(root.left);
    //     invert(root.right);
    //     if(root.left!=null && root.right!=null){
    //         TreeNode temp=root.left;
    //         root.left=root.right;
    //         root.right=temp;
    //     }
    //     else if(root.left==null && root.right!=null){
    //         TreeNode nn=new TreeNode(root.right.val);
    //         root.left=nn;
    //         root.right=null;
    //     }
    //     else if(root.right==null  && root.left!=null){
    //         TreeNode nn=new TreeNode(root.left.val);
    //         root.right=nn;
    //         root.left=null;
    //     }
    // }
}