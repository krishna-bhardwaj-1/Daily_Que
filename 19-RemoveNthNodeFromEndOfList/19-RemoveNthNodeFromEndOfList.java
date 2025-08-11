// Last updated: 12/08/2025, 00:21:46
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head,fast=head;
        while(n-->0){
            fast=fast.next;
        }
        if(fast==null){
            ListNode temp=head;
            head=head.next;
            temp.next=null;
            return head;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode temp=slow.next;
        slow.next=slow.next.next;
        temp.next=null;
        return head;
    }
}