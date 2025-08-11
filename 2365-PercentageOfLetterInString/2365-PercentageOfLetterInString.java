// Last updated: 12/08/2025, 00:12:12
class Solution {
    public int percentageLetter(String s, char letter) {
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter){
                c++;
            }
        }
        int res=(c*100)/s.length();
        return res;
    }
}