// Last updated: 12/08/2025, 00:16:29
class Solution {
    public int scoreOfParentheses(String s) {
        int c=0;
        Stack<Integer> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(c);
                c=0;
            }
            else{
                c = st.pop() + Math.max(2 * c, 1);
            }
        }
        return c;
    }
}