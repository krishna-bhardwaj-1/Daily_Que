// Last updated: 12/08/2025, 00:20:13
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
    // public boolean isBalanced(TreeNode root) {
    //     if(root==null) return true;
    //     int leftheight=height(root.left);
    //     int rightheight=height(root.right);

    //     int diff=Math.abs(leftheight-rightheight);

    //     // if(diff<=1){
    //     //     boolean left=isBalanced(root.left);
    //     //     boolean right=isBalanced(root.right);

    //     //     return left && right;
    //     // }
    //     // else{
    //     //     return false;
    //     // }

    //     return diff<=1 && isBalanced(root.left) && isBalanced(root.right);
    // }
    // public static int height(TreeNode root){
    //     if(root==null) return 0;
    //     int leftkiheight=height(root.left);
    //     int rightkiheight=height(root.right);

    //     return Math.max(leftkiheight,rightkiheight)+1;
    // }
    class balancepair{
        boolean isbal=true;
        int ht=-1;
    }
    public boolean isBalanced(TreeNode root){
        return isbalance(root).isbal;
    }

    public balancepair isbalance(TreeNode root){
        if(root==null) return new balancepair();
        
        balancepair lbp=isbalance(root.left);
        balancepair rbp=isbalance(root.right);
        balancepair sbp=new balancepair();
        sbp.ht=Math.max(lbp.ht,rbp.ht)+1;

        boolean sb=Math.abs(lbp.ht-rbp.ht)<=1;
        sbp.isbal=lbp.isbal && rbp.isbal && sb;
        return sbp;
    }
}