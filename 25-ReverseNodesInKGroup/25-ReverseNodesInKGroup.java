// Last updated: 12/08/2025, 00:21:36
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode start=head,end=head;
        for(int i=0;i<k;i++){
            if(end==null){
                return head;
            }
            end=end.next;
        }
        ListNode newhead=reverse(start,end);
        start.next=reverseKGroup(end,k);
        return newhead;
    }
    public ListNode reverse(ListNode head,ListNode end){
        ListNode curr=head,prev=null;
        while(curr!=end){
            ListNode add=curr.next;
            curr.next=prev;
            prev=curr;
            curr=add;
        }
        return prev;
    }
}