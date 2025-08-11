// Last updated: 12/08/2025, 00:20:19
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
    static List<List<Integer>> lll;
    static boolean level;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        lll=new ArrayList<>();
        level=true;
        helper(root);
        return lll;
    }
    private void helper(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> ll=new ArrayList<>();
            for(int i=0;i<size;i++){

                TreeNode front=q.poll();
                // ll.add(front.val);

                if(level){
                    ll.add(front.val);
                }
                else{
                    ll.add(0,front.val);
                }
                if(front.left!=null){
                    q.add(front.left);
                }
                if(front.right!=null){
                    q.add(front.right);
                }
            }
            lll.add(ll);
            level=!level;
        }
    }
}