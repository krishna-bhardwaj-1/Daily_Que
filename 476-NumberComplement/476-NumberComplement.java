// Last updated: 12/08/2025, 00:17:47
class Solution {
    public int findComplement(int num) {
        String st=Integer.toBinaryString(num);
        String r="";
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='0'){
                r+='1';
            }
            else{
                r+='0';
            }
        }
        return Integer.parseInt(r,2);
    }
}