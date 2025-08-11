// Last updated: 12/08/2025, 00:20:55
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0) return head;
        int n=1;
        ListNode tail=head,temp=head;
        while(tail.next!=null){
            n++;
            tail=tail.next;
        }
        if(k%n==0) return head;
        k=k%n;
        tail.next=head;
        // int c=1;
        // while(temp!=null){
        //     if(c==(n-k)) break;
        //     temp=temp.next;
        //     c++;
        // }
        int c=n-k;
        while(c-->1){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}