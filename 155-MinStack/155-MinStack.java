// Last updated: 12/08/2025, 00:19:36
class pair{
    int a;
    int b;
    pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}
class MinStack {
    Stack<pair> st;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        int min=0;
        if(st.isEmpty()){
            min=val;
        }
        else{
            min=Math.min(val,st.peek().b);
        }
        st.push(new pair(val,min));
    }
    

    public void pop() {
        st.pop();    
    }
    
    public int top() {
        return st.peek().a;
    }
    public int getMin() {
        return st.peek().b;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */