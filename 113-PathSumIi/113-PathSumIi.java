// Last updated: 12/08/2025, 00:20:09
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        sol(root,targetSum,ans,curr);
        return ans;
    }
    public static void sol(TreeNode root, int targetSum,List<List<Integer>> ans,List<Integer> curr){
        if(root==null) return;

        if(root.left==null && root.right==null && (targetSum-root.val)==0){
            curr.add(root.val);
            List<Integer> dummy=new ArrayList<>(curr);
            ans.add(dummy);
            curr.remove(curr.size()-1);
            return;
        }

        curr.add(root.val);
        sol(root.left,targetSum-root.val,ans,curr);
        sol(root.right,targetSum-root.val,ans,curr);
        curr.remove(curr.size()-1);
    }
}