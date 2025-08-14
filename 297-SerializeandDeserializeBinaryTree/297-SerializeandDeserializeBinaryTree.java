// Last updated: 14/08/2025, 11:55:33
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        build(root,sb);
        return sb.toString();
    }

    private void build(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("null,");
            return;
        }
        sb.append(root.val).append(",");
        build(root.left,sb);
        build(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==null || data.isEmpty()) return null; 
        String[] arr=data.split(",");
        idx=0;
        return buildTree(arr);
    }
    int idx=0;
    private TreeNode buildTree(String[] arr){
        if(idx>=arr.length) return null;
        String s=arr[idx++];
        if(s.equals("null")){
            return null;
        }
        TreeNode nn=new TreeNode(Integer.parseInt(s));
        nn.left=buildTree(arr);
        nn.right=buildTree(arr);
        return nn;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));