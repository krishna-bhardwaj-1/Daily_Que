// Last updated: 12/08/2025, 00:09:54
class Solution {
    public String convertDateToBinary(String date) {
        String[] s=date.split("-");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length;i++){
            sb.append(binary(s[i]));
            if(i<s.length-1){
                sb.append("-");
            }
        }
        return sb.toString();
    }
    private static String binary(String s){
        int n=Integer.parseInt(s);
        StringBuilder sb=new StringBuilder();
        while(n>0){
            int rem=n%2;
            sb.append(rem);
            n/=2;
        }
        return sb.reverse().toString();
    }
}