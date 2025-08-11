// Last updated: 12/08/2025, 00:12:37
class Solution {
    public boolean checkString(String s) {
        if(s.length()==1){
            return true;
        }
        int i = 0;
        while (i < s.length() && s.charAt(i) != 'b') {
            i++;
        }
        for(;i<s.length();i++){
            if(s.charAt(i)=='a'){
                return false;
            }
        }
        return true;
    }
}