// Last updated: 12/08/2025, 00:14:39
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s=sentence.split(" +");
        int len=searchWord.length();
        for(int i=0;i<s.length;i++){
            if(s[i].length()>=len){
            if(s[i].substring(0, len).equals(searchWord)) {
                return i+1;
            }
            }
        }
        return -1;
    }
}