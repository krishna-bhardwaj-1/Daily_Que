// Last updated: 12/08/2025, 00:18:46
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
    static List<String> ll;
    public List<String> binaryTreePaths(TreeNode root) {
        ll=new ArrayList<>();
        path(root,"");
        return ll;
    }
    public void path(TreeNode root,String s){
        if(root==null){
            return;
        }
        s+=root.val;
        if(root.left==null && root.right==null){
            ll.add(s);
            return;
        }
        s+="->";
        path(root.left,s);
        path(root.right,s);
    }
}