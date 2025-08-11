// Last updated: 12/08/2025, 00:19:47
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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        Stack<ListNode> st=new Stack<>();
        ListNode mid=middle(head);
        ListNode temp=mid.next;
        mid.next=null;
        while(temp!=null){
            st.push(temp);
            temp=temp.next;
        }
        ListNode curr=head;
        while(!st.isEmpty()){
            ListNode add=curr.next;
            ListNode prev=st.pop();
            curr.next=prev;
            curr=add;
            prev.next=curr;
        }
    }
    private static ListNode middle(ListNode head){
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

}