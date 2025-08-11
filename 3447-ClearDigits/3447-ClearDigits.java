// Last updated: 12/08/2025, 00:10:09
class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch>='0' && ch<='9'){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}