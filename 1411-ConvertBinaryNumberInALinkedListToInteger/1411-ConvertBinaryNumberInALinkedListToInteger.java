// Last updated: 12/08/2025, 00:15:12
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
    static int sum;
    public int getDecimalValue(ListNode head) {
        sum=0;
        helper(head);
        return sum;
    }
    public int helper(ListNode head){
        if(head==null){
            return 1;
        }
        int mul=helper(head.next);
        sum+=mul*head.val;
        return mul*2;
    }
}