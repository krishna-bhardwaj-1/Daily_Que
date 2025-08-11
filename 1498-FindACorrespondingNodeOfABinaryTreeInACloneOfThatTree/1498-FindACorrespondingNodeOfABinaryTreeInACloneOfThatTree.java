// Last updated: 12/08/2025, 00:14:52
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode dummy;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original!=null){
            if(cloned.val==target.val){
                dummy=cloned;
            }
            getTargetCopy(original.left,cloned.left,target);
            getTargetCopy(original.right,cloned.right,target);
        }
        return dummy;
    }
}