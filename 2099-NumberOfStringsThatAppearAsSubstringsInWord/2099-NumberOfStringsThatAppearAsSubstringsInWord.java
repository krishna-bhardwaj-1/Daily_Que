// Last updated: 12/08/2025, 00:13:16
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String s:patterns){
            if(word.contains(s)){
                c++;
            }
        }
        return c;
    }
}