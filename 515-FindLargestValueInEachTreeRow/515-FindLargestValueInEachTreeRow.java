// Last updated: 12/08/2025, 00:17:34
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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> ll=new LinkedList<>();
        if(root==null) return ll;
        q.add(root);
        while (!q.isEmpty()){
            int max=Integer.MIN_VALUE;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode n=q.poll();
                max=Math.max(max,n.val);
                if(n.left!=null){
                    q.add(n.left);
                }
                if(n.right!=null){
                    q.add(n.right);
                }
            }
            ll.add(max);
            
        }
        return ll;
        
    }
}