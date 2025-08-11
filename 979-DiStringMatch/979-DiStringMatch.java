// Last updated: 12/08/2025, 00:16:06
class Solution {
    public int[] diStringMatch(String s) {
        int[] arr=new int[s.length()+1];
        Stack<Integer> st=new Stack<>();
        int c=0;
        for(int i=0;i<=s.length();i++){
            if(i==s.length() || s.charAt(i)=='I'){
                arr[i]=c;
                c++;
                while(!st.isEmpty()){
                    arr[st.pop()]=c;
                    c++;
                }
            }
            else{
                st.push(i);
            }
        }
        return arr;
    }
}