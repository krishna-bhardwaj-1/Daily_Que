// Last updated: 12/08/2025, 00:21:44
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ci=s.charAt(i);

            if(ci=='{'|| ci=='['|| ci=='('){
                st.push(ci);
            }
            else if(ci=='}'||ci==']'||ci==')'){
                if(st.isEmpty()){
                    return false;
                }
                char topch=st.pop();
                if(topch=='(' && ci==')'){
                    continue;
                }
                if(topch=='{' && ci=='}'){
                    continue;
                }
                if(topch=='[' && ci==']'){
                    continue;
                }
                return false;
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}