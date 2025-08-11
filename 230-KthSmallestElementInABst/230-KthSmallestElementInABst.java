// Last updated: 12/08/2025, 00:18:58
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
    static int cnt;
    static int ans;
    public int kthSmallest(TreeNode root, int k) {
        cnt=0;
        ans=0;
        helper(root,k);
        return ans;
    }
    private void helper(TreeNode root,int k){
        if(root==null) return;
        helper(root.left,k);
        cnt++;
        if(cnt==k){
            ans=root.val;
            return;
        }
        helper(root.right,k);
    }
}