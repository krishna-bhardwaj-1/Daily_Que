// Last updated: 12/08/2025, 00:19:02
class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1=new LinkedList<Integer>();
        q2=new LinkedList<Integer>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        int rv=q1.remove();
        while(q2.size()>0){
            q1.add(q2.remove());
        }
        return rv;
    }
    
    public int top() {
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        int rv=q1.peek();
        q2.add(q1.remove());
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        return rv;
    }
    
    public boolean empty() {
        return q1.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */