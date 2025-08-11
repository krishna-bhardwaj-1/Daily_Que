// Last updated: 12/08/2025, 00:10:50
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode first=head,second=head.next;
        while(second!=null){
            int vl=gcd(first.val,second.val);
            ListNode nn=new ListNode(vl);
            first.next=nn;
            nn.next=second;
            first=second;
            second=second.next;
        }
        return head;
    }

    private static int gcd(int a,int b){
        while(a%b!=0){
            int t=b%a;
            b=a;
            a=t;
        }
        return b;
    }
}