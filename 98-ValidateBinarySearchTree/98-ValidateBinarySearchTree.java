// Last updated: 12/08/2025, 00:20:24
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
    // public boolean isValidBST(TreeNode root) {
    //     return validateBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    // }   
    // public boolean validateBST(TreeNode root,long min,long max){
    //     if(root==null) return true;

    //     if(root.val<=min || root.val>=max) return false;

    //     boolean left=validateBST(root.left,min,root.val);
    //     boolean right=validateBST(root.right,root.val,max);
    //     return left && right;
    // }

    public boolean isValidBST(TreeNode root) {
        return ValidBST(root).isbst;
    }

    public BstPair ValidBST(TreeNode root){
        if(root==null){
            return new BstPair();
        }

        BstPair lbp=ValidBST(root.left);
        BstPair rbp=ValidBST(root.right);
        BstPair sbp=new BstPair();
        sbp.min = Math.min(lbp.min,Math.min(rbp.min,root.val));
        sbp.max = Math.max(lbp.max,Math.max(rbp.max,root.val));
        sbp.isbst = lbp.isbst && rbp.isbst && lbp.max<root.val && rbp.min>root.val;
        return sbp;
    }
    class BstPair{
        boolean isbst=true;
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
    }

}