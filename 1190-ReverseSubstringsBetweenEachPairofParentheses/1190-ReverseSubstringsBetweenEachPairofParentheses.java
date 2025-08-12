// Last updated: 13/08/2025, 01:09:40
class Solution {
    public String reverseParentheses(String s) {
        char[] arr=s.toCharArray();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('){
                st.push(i);
            }
            else if(arr[i]==')'){
                rev(st.pop()+1,i-1,arr);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:arr){
            if(ch!=')' && ch!='(') sb.append(ch);
        }
        return sb.toString();
    }
    public void rev(int i,int j,char[] arr){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}