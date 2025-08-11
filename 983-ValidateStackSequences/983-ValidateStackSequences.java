// Last updated: 12/08/2025, 00:16:03
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<pushed.length;i++){
            st.push(pushed[i]);
            while(st.size()>0 && st.peek()==popped[j]){
                st.pop();
                j++;
            }
        }
        while(j<popped.length){
            if(st.peek()==popped[j]){
                st.pop();
            }
            else{
                return false;
            }
            j++;
        }
        return st.size()==0;
    }
}