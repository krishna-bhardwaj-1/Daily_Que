// Last updated: 12/08/2025, 00:14:34
class Node{
    String data;
    Node next;
    Node back;
    public Node(String data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}
class BrowserHistory {
    Node curr;
    public BrowserHistory(String homepage) {
        curr=new Node(homepage);
    }
    
    public void visit(String url) {
        Node nn=new Node(url);
        curr.next=nn;
        nn.back=curr;
        curr=nn;
    }
    
    public String back(int steps) {
        while(steps-->0){
            if(curr.back!=null) curr=curr.back;
            else break;
        }
        return curr.data;
    }
    
    public String forward(int steps) {
        while(steps-->0){
            if(curr.next!=null){
                curr=curr.next;
            }
            else{
                break;
            }
        }
        return curr.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */