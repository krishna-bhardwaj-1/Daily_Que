// Last updated: 12/08/2025, 00:08:54
class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='*'){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            else if(ch=='#'){
                sb.append(sb.toString());
            }
            else if(ch=='%'){
                sb.reverse();
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}