// Last updated: 12/08/2025, 00:19:15
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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        while(head!=null && head.val==val){
            head=head.next;
        }
        ListNode t1=head;
        if(t1==null) return head;
        ListNode t2=t1.next;
        while(t2!=null){
            if(t2.val==val){
                t1.next=t2.next;
                ListNode temp=t2.next;
                t2.next=null;
                t2=temp;
            }
            else{
                t1=t1.next;
                t2=t2.next;
            }
        }
        return head;
    }
}