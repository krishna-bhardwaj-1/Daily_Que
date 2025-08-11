// Last updated: 12/08/2025, 00:11:32
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        ListNode curr=head;
        while(curr!=null){
            while(!st.isEmpty() && st.peek().val<curr.val){
                st.pop();
            }
            st.push(curr);
            curr=curr.next;
        }

        ListNode dummy=null;
        while(!st.isEmpty()){
            ListNode temp=st.pop();
            temp.next=dummy;
            dummy=temp;
        }
        return dummy;
    }
}