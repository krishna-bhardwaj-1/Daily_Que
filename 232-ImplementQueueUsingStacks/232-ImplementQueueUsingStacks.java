// Last updated: 12/08/2025, 00:18:56
class MyQueue {
    Stack<Integer> st;
    Stack<Integer> temp;
    public MyQueue() {
        st=new Stack<>();
        temp=new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        int rv= temp.pop();
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        return rv;
    }
    
    public int peek() {
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        int rv= temp.peek();
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        return rv;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */