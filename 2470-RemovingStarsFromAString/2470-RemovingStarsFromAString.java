// Last updated: 12/08/2025, 00:11:54
class Solution {
    public String removeStars(String s) {
        return(helper(s));
    }
    private static String helper(String s){
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='*'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else {
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}