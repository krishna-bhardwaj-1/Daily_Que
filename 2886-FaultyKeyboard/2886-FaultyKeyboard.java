// Last updated: 12/08/2025, 00:10:51
class Solution {
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i'){
                sb.reverse();
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}