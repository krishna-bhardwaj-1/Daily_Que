// Last updated: 12/08/2025, 00:15:45
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
    public TreeNode bstToGst(TreeNode root) {
        sum=0;
        return BSTtoGST(root);
    }
    private TreeNode BSTtoGST(TreeNode root){
        if(root==null) return null;

        //right -> self -> left
        BSTtoGST(root.right);
        int temp=root.val;
        sum+=temp;
        root.val=sum;

        BSTtoGST(root.left);
        return root;
    }
}