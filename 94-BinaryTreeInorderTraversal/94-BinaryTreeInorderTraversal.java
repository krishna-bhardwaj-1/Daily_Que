// Last updated: 12/08/2025, 00:20:27
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        inorder(root,ll);
        return ll;
    }
    private static void inorder(TreeNode root,List<Integer> ans){
        if(root==null) return;

        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
}