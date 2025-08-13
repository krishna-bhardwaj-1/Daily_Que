// Last updated: 13/08/2025, 23:40:46
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return createTree(preorder,inorder,0,inorder.length-1,0,preorder.length-1);
    }
    private TreeNode createTree(int[] pre,int[] in,int ilo,int ihi,int plo,int phi){
        if(ilo>ihi || plo>phi){
            return null;
        }
        TreeNode node=new TreeNode(pre[plo]);
        int idx=search(in,ilo,ihi,pre[plo]);
        int cnt=idx-ilo;
        node.left=createTree(pre,in,ilo,idx-1,plo+1,plo+cnt);
        node.right=createTree(pre,in,idx+1,ihi,plo+cnt+1,phi);
        return node;
    }

    private int search(int[] inorder,int ilo,int ihi,int item){
        for(int i=ilo;i<=ihi;i++){
            if(inorder[i]==item){
                return i;
            }
        }
        return -1;
    }
}