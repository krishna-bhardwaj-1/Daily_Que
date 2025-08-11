// Last updated: 12/08/2025, 00:17:01
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s:operations){
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                int n=st.peek();
                st.push(n*2);
            }
            else if(s.equals("+")){
                int a=st.pop();
                int b=st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}