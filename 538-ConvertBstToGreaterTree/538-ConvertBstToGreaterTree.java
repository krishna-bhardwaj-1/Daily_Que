// Last updated: 12/08/2025, 00:17:25
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
    public TreeNode convertBST(TreeNode root) {
        sum=0;
        return BSTtoGST(root);
    }

    private TreeNode BSTtoGST(TreeNode root){
        if(root==null) return null;

        BSTtoGST(root.right);
        int temp=root.val;
        sum+=temp;
        root.val=sum;
        BSTtoGST(root.left);
        return root;
    }
}