// Last updated: 12/08/2025, 00:20:31
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int ans=0;
        int[] arr=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='0'){
                    arr[j]=0;
                }
                else{
                    arr[j]++;
                }
            }
            ans=Math.max(ans,RectangleArea(arr));
        }
        return ans;
    }
    public static int RectangleArea(int[] arr) {
        int ans=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h=arr[st.pop()];
                int r=i;
                if(st.isEmpty()){
                    ans=Math.max(ans,h*r);
                }
                else{
                    int l=st.peek();
                    ans=Math.max(ans,h*(r-l-1));
                }
            }
            st.push(i);
        }
        int r=arr.length;
        while(!st.isEmpty()){
            int h=arr[st.pop()];
            if(st.isEmpty()){
                ans=Math.max(ans,h*r);
            }
            else{
                int l=st.peek();
                ans=Math.max(ans,h*(r-l-1));
            }
        }
        return ans;
    }
}