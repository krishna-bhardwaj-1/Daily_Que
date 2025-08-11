// Last updated: 12/08/2025, 00:14:10
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode t1=list1,t2=list1;
        while(a-->1){
            t1=t1.next;
        }
        while(b-->0){
            t2=t2.next;
        }
        ListNode til=tail(list2);
        t1.next=list2;
        ListNode add=t2.next;
        t2.next=null;
        til.next=add;
        return list1;
    }
    public ListNode tail(ListNode head){
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        return curr;
    }
}