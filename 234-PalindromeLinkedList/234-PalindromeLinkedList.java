// Last updated: 12/08/2025, 00:18:54
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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newhead=reverseList(slow.next);
        ListNode first=head,second=newhead;
        while(second!=null){
            if(first.val!=second.val){
                reverseList(newhead);
                return false;
            }
            second=second.next;
            first=first.next;
        }
        reverseList(newhead);
        return true;
    }
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode address=curr.next;
            curr.next=prev;
            prev=curr;
            curr=address;
        }
        return prev;
    }
}