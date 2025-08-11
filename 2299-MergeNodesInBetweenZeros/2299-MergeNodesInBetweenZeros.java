// Last updated: 12/08/2025, 00:12:20
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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        ListNode khda=head.next;
        int sum=0;
        while(khda!=null){
            if(khda.next.val==0){
                sum+=khda.val;
                khda.val=sum;
                curr.next=khda;
                curr=khda;
                khda=khda.next.next;
                sum=0;
            }
            else{
                sum+=khda.val;
                khda=khda.next;
            }
        }
        curr.next=null;
        return dummy.next;
    }
}