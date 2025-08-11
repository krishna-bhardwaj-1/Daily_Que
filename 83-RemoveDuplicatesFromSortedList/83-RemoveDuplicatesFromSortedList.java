// Last updated: 12/08/2025, 00:20:34
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
        ListNode temp1=head,temp2=head;
        while(temp2!=null){
            if(temp1.val!=temp2.val){
                temp1.next=temp2;
                temp2=temp2.next;
                temp1=temp1.next;
            }
            else{
                ListNode temp=temp2.next;
                temp2.next=null;
                temp1.next=null;
                temp2=temp;
            }
        }
        return head;
    }
}