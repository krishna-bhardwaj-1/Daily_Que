// Last updated: 12/08/2025, 00:17:22
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
    class Pair{
        int height=-1;
        int diameter=0;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        Pair ans=diameterOfBinary(root);
        return ans.diameter;
    }
    public Pair diameterOfBinary(TreeNode root) {
        if(root==null) return new Pair();

        Pair ldp=diameterOfBinary(root.left);
        Pair rdp=diameterOfBinary(root.right);

        Pair sdp=new Pair();
        sdp.height=Math.max(ldp.height,rdp.height)+1;
        int apnadia=ldp.height+rdp.height+2;

        sdp.diameter=Math.max(apnadia,Math.max(ldp.diameter,rdp.diameter));
        return sdp;
    }
}