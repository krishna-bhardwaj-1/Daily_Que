// Last updated: 12/08/2025, 00:17:55
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len=length(l1);
        int len2=length(l2);
        ListNode result;
        if(len>len2){
            ListNode curr=l1;
            for(int i=0;i<len-len2;i++){
                curr=curr.next;
            }
            int carry=sum_of_two(curr,l2,true);
            carry=addcarry(l1,curr,carry);
            if(carry>0){
                ListNode nn=new ListNode(carry);
                nn.next=l1;
                l1=nn;
            }
            result=l1;
        }
        else {
            ListNode curr=l2;
            for(int i=0;i<len2-len;i++){
                curr=curr.next;
            }
            int carry=sum_of_two(l1,curr,false);
            carry=addcarry(l2,curr,carry);
            if(carry>0){
                ListNode nn=new ListNode(carry);
                nn.next=l2;
                l2=nn;
            }
            result=l2;
        }
        return result;
    }

    private static int addcarry(ListNode head,ListNode curr,int carry){
        if(head==curr || carry==0){
            return carry;
        }
        int newCarry = addcarry(head.next, curr, carry);
        int sum = head.val + newCarry;
        head.val = sum % 10;
        return sum / 10;
    }
    private static int length(ListNode l1){
        ListNode m1=l1;
        int a=0;
        while(m1!=null) {
            a++;
            m1 = m1.next;
        }
        return a;
    }
    private static int sum_of_two(ListNode temp1,ListNode temp2,boolean x){
        if(temp1==null && temp2==null){
            return 0;
        }
        int recans  = sum_of_two(temp1.next, temp2.next,x);
        int merans = recans + temp1.val + temp2.val;
        if(x){
            temp1.val=merans%10;
        }
        else temp2.val = merans % 10;
        return merans/10;
    }
}