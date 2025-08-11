// Last updated: 12/08/2025, 00:19:51
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp=head;
        while(temp!=null){
            Node cpnode=new Node(temp.val);
            cpnode.next=temp.next;
            temp.next=cpnode;
            temp=temp.next.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.random!=null){
                temp.next.random=temp.random.next;
            }
            else{
                temp.next.random=null;
            }
            temp=temp.next.next;
        }

        Node dummy=new Node(-1);
        Node res=dummy;
        temp=head;
        while(temp!=null){
            res.next=temp.next;
            temp.next=temp.next.next;
            temp=temp.next;
            res=res.next;
        }
        return dummy.next;
    }
}