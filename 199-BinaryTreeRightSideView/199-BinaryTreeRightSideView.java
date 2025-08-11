// Last updated: 12/08/2025, 00:19:18
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
    static int maxlevel;
    public List<Integer> rightSideView(TreeNode root) {
        maxlevel=0;
        List<Integer> ans=new ArrayList<>();
        helper(root,1,ans);
        return ans;
    }
    private static void helper(TreeNode root,int level,List<Integer> ans){
        if(root==null) return;

        if(maxlevel<level){
            ans.add(root.val);
            maxlevel=level;
        }
        helper(root.right,level+1,ans);
        helper(root.left,level+1,ans);
    }

}