// Last updated: 12/08/2025, 00:16:56
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                ans[st.peek()]=i-st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=0;
        }
        return ans;
    }
}