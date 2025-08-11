// Last updated: 12/08/2025, 00:15:09
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ll=new ArrayList<>();
        helper(root1);
        helper(root2);
        Collections.sort(ll);
        return ll;
    }
    private static void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        ll.add(root.val);
        helper(root.right);
    }

}