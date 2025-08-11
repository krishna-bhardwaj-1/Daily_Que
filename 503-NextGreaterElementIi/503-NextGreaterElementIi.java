// Last updated: 12/08/2025, 00:17:39
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop();
            }
            if(i<n){
                    ans[i]=st.isEmpty()?-1:st.peek();
            }
            st.push(nums[i%n]);
        }
        return ans;
    }
}