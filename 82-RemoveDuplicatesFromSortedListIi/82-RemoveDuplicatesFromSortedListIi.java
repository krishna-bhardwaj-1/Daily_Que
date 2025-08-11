// Last updated: 12/08/2025, 00:20:35
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode fir=new ListNode(-1);
        fir.next=head;
        ListNode sec=fir;
        while(sec.next!=null && sec.next.next!=null){
            if(sec.next.val==sec.next.next.val){
                int value=sec.next.val;
                while(sec.next!=null && sec.next.val==value){
                    sec.next=sec.next.next;
                }
            }
            else{
                sec=sec.next;
            }
        }
        return fir.next;
    }
}