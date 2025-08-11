// Last updated: 12/08/2025, 00:19:44
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
    public List<Integer> postorderTraversal(TreeNode root) {
        ll=new ArrayList<>();
        postorder(root);
        return ll;
    }
    private void postorder(TreeNode root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        ll.add(root.val);
    }
}