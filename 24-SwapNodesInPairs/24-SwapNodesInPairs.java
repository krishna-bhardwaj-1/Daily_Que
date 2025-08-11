// Last updated: 12/08/2025, 00:21:39
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
    public ListNode swapPairs(ListNode head) {
        ListNode start=head,end=head;
        for(int i=0;i<2;i++){
            if(end==null){
                return head;
            }
            end=end.next;
        }
        ListNode newhead=reverse(start,end);
        start.next=swapPairs(end);
        return newhead;
    }
    private static ListNode reverse(ListNode start,ListNode end){
        ListNode curr=start,prev=null;
        while(curr!=end){
            ListNode add=curr.next;
            curr.next=prev;
            prev=curr;
            curr=add;
        }
        return prev;
    }
}