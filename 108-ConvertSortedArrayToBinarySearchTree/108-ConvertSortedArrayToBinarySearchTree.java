// Last updated: 12/08/2025, 00:20:15
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return BST(0,nums.length-1,nums);
    }

    private TreeNode BST(int l,int r,int[] arr){
        if(l>r) return null;

        int mid=(l+r)/2;
        TreeNode node =new TreeNode(arr[mid]);
        node.left=BST(l,mid-1,arr);
        node.right=BST(mid+1,r,arr);
        return node;
    }
}