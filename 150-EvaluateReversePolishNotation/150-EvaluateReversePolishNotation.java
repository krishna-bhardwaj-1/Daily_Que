// Last updated: 12/08/2025, 00:19:41
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                int a=st.pop();
                int b=st.pop();
                st.push(a+b);
            }
            else if(s.equals("-")){
                int a=st.pop();
                int b=st.pop();
                st.push(b-a);
            }
            else if(s.equals("*")){
                int a=st.pop();
                int b=st.pop();
                st.push(a*b);
            }
            else if(s.equals("/")){
                int a=st.pop();
                int b=st.pop();
                st.push(b/a);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}