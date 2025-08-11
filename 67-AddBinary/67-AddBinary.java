// Last updated: 12/08/2025, 00:20:49
class Solution {
    public String addBinary(String a, String b) {
        int n1=a.length()-1;
        int n2=b.length()-1;
        int c=0;
        int base=2;
        StringBuilder st=new StringBuilder();
        while(n1>=0||n2>=0){
            int t1=0,t2=0,sum=0;
            if(n1>=0){
                t1=a.charAt(n1--)-'0';
            }
            if(n2>=0){
                t2=b.charAt(n2--)-'0';
            }
            sum=t1+t2+c;
            if(sum>=base){
                sum-=base;
                c=1;
            }
            else{
                c=0;
            }
            st.append(sum);
        }
        if(c==1){
            st.append(c);
        }
        return st.reverse().toString();
    }
}