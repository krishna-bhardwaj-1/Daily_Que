// Last updated: 12/08/2025, 00:15:23
class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i<=1){
                sb.append(s.charAt(i));
            }
            else{
                if(s.charAt(i-2)==s.charAt(i-1) && s.charAt(i-1)==s.charAt(i)){
                    continue;
                }
                else{
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}