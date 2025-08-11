// Last updated: 12/08/2025, 00:20:16
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
    int preorderiter;
    Map<Integer,Integer> inordermapping;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inordermapping=new HashMap<>();
        preorderiter=0;
        for(int i=0;i<inorder.length;i++){
            inordermapping.put(inorder[i],i);
        }
        return buildTree(preorder,0,preorder.length-1);
    }

    public TreeNode buildTree(int[] preorder,int left,int right){
        if(left>right){
            return null;
        }
        int rootval=preorder[preorderiter++];
        TreeNode root=new TreeNode(rootval);

        int rootidx=inordermapping.get(rootval);

        root.left=buildTree(preorder,left,rootidx-1);
        root.right=buildTree(preorder,rootidx+1,right);

        return root;
    }
}