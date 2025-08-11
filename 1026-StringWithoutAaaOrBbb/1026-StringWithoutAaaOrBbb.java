// Last updated: 12/08/2025, 00:15:51
class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder sb=new StringBuilder();
        while(a>0 || b>0){
            if(a>b && b!=0){
                sb.append("aab");
                a-=2;
                b--;
            }
            else if(a<b&&a!=0){
                sb.append("bba");
                a--;
                b-=2;
            }
            else if(a>0){
                sb.append("a");
                a--;
            }
            else{
                sb.append("b");
                b--;
            }
        }
        return sb.toString();
    }
}