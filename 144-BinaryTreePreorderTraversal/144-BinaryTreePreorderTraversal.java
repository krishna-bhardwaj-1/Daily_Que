// Last updated: 12/08/2025, 00:19:46
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
    static List<Integer> ll;
    public List<Integer> preorderTraversal(TreeNode root) {
        ll=new ArrayList<>();
        helper(root);
        return ll;
    }
    private static void helper(TreeNode root){
        if(root==null) return;
        ll.add(root.val);
        helper(root.left);
        helper(root.right);
    }
}