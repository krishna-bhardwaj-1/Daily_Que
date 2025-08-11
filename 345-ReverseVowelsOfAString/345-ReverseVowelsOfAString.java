// Last updated: 12/08/2025, 00:18:23
class Solution {
    public String reverseVowels(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                st.push(ch);
            }
        }
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                str.append(st.pop());
            }
            else{
                str.append(ch);
            }
        }
        return str.toString();
    }
}