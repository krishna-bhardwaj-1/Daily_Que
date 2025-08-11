// Last updated: 12/08/2025, 00:12:04
class Solution {
    public char repeatedCharacter(String s) {
        int[] freq=new int[26];
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            freq[ch-'a']++;
            if(freq[ch-'a']>=2){
                return ch;
            }
            i++;
        }
        return s.charAt(0);
    }
}