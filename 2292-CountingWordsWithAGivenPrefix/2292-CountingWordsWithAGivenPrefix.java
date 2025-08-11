// Last updated: 12/08/2025, 00:12:23
class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(String s:words){
            if(s.startsWith(pref)){
                c++;
            }
        }
        return c;
    }
}