// Last updated: 12/08/2025, 00:17:30
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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int c=k;
        ListNode first=head;
        while(c>1){
            first=first.next;
            c--;
        }
        ListNode sec=head;
        c=len(head)-k;
        while(c>0){
            sec=sec.next;
            c--;
        }
        int temp=first.val;
        first.val=sec.val;
        sec.val=temp;
        return head;
    }
    private int len(ListNode temp){
        if(temp.next==null) return 1;
        int c=1;
        while(temp.next!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
}