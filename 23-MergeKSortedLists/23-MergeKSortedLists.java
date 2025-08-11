// Last updated: 12/08/2025, 00:21:40
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
    public ListNode mergeKLists(ListNode[] lists) {
    //     if(lists.length==0) return null;
    //     ListNode head=lists[0];
    //     for(int i=1;i<lists.length;i++){
    //         ListNode temp=lists[i];
    //         head=mergetwo(head,temp);
    //     }
    //     return head;
    // }
    // private ListNode mergetwo(ListNode l1,ListNode l2){
    //     ListNode dummy=new ListNode(-1);
    //     ListNode temp=dummy;
    //     while(l1!=null && l2!=null){
    //         if(l1.val<l2.val){
    //             temp.next=l1;
    //             temp=l1;
    //             l1=l1.next;
    //         }
    //         else{
    //             temp.next=l2;
    //             temp=l2;
    //             l2=l2.next;
    //         }
    //     }

    //     if(l1!=null){
    //         temp.next=l1;
    //     }
    //     else{
    //         temp.next=l2;
    //     }
    //     return dummy.next;
    // }

    PriorityQueue<ListNode> pq=new PriorityQueue<>((a, b) -> a.val - b.val);
    for(int i=0;i<lists.length;i++){
        if(lists[i]!=null){
            pq.add(lists[i]);
        }
    }
    ListNode dummy=new ListNode(-1);
    ListNode temp=dummy;
    while(!pq.isEmpty()){
        ListNode small=pq.poll();
        temp.next=small;
        temp=small;
        if(small.next!=null){
            pq.add(small.next);
        }
    }
    return dummy.next;
    }
}