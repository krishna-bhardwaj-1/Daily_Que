// Last updated: 12/08/2025, 00:18:52
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode givenNext=node.next;
        
        node.val=givenNext.val;
        node.next=givenNext.next;
        givenNext.next=null;
    }
}