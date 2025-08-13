// Last updated: 13/08/2025, 11:32:26
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
    //needcamera=-1
    //hascamera=1
    //covered=0
    private int cam=0;
    public int minCameraCover(TreeNode root) {
        int c=camera(root);
        if(c==-1) cam++;
        return cam;
    }
    public int camera(TreeNode root){
        if(root==null) return 0;
        int left=camera(root.left);
        int right=camera(root.right);
        if(left==-1||right==-1){
            cam++;
            return 1;
        }
        else if(left==1 || right==1){
            return 0;
        }
        else{
            return -1; // dono child only covered hai.
        }
    }
}