// Last updated: 12/08/2025, 00:17:42
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] num=new int[nums1.length];
        int[] ans=NGE(nums2);
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    num[i]=ans[j];
                }
            }
        }
        return num;
    }
    public static int[] NGE(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<ans.length;i++){
            while (!st.isEmpty() && arr[i]>arr[st.peek()]){
                ans[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        return ans;
    }
}