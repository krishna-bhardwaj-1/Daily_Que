// Last updated: 12/08/2025, 00:20:59
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        char[] ch=s.toCharArray();
        int c=0;
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]!=' '){
                c++;
            }
            else {
                break;
            }
        }
        return c;
    }
}