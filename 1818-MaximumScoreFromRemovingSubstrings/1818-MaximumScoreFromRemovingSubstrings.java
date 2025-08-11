// Last updated: 12/08/2025, 00:14:00
class Solution {
    public int maximumGain(String s, int x, int y) {
        int score=0;
        Stack<Character> st=new Stack<>();
        if(x<y){
            for(char ch:s.toCharArray()){
                if(ch=='a' && !st.isEmpty() && st.peek()=='b'){
                    score+=y;
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            StringBuilder sb=new StringBuilder();
            while(st.size()>0){
                sb.append(st.pop());
            }
            Stack<Character> temp=new Stack<>();
            for(char ch:sb.toString().toCharArray()){
                if(ch=='a' && !temp.isEmpty() && temp.peek()=='b'){
                    score+=x;
                    temp.pop();
                }
                else{
                    temp.push(ch);
                }
            }
        }
        else{
            for(char ch:s.toCharArray()){
                if(ch=='b' && !st.isEmpty() && st.peek()=='a'){
                    score+=x;
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
            StringBuilder sb=new StringBuilder();
            while(st.size()>0){
                sb.append(st.pop());
            }
            Stack<Character> temp=new Stack<>();
            for(char ch:sb.toString().toCharArray()){
                if(ch=='b' && !temp.isEmpty() && temp.peek()=='a'){
                    score+=y;
                    temp.pop();
                }
                else{
                    temp.push(ch);
                }
            }
        }
        
        return score;
    }
}