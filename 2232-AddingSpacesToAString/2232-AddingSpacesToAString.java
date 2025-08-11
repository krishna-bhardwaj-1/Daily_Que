// Last updated: 12/08/2025, 00:12:42
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str= new StringBuilder("");
        int c=0;
        for(int i=0;i<s.length();i++){
            if(i==spaces[c]){
                str.append(" ");
                if(c<spaces.length-1){
                    c++;
                }
            }
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}