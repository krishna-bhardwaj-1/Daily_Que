// Last updated: 12/08/2025, 00:10:00
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        ListNode me=head;
        Set<Integer> numset = new HashSet<>();
        for (int num : nums) {
            numset.add(num);
        }
        while(me!=null){
            if(numset.contains(me.val)){
                ListNode add=me.next;
                me.next=null;
                me=add;
            }
            else{
                curr.next=me;
                curr=me;
                me=me.next;
            }
        }
        curr.next=null;
        return dummy.next;
    }
}