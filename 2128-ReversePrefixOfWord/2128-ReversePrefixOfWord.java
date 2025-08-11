// Last updated: 12/08/2025, 00:13:05
class Solution {
    public String reversePrefix(String word, char ch) {
        int idx=index(word,ch);
        StringBuilder sb=new StringBuilder();
        for(int i=idx;i>=0;i--){
            sb.append(word.charAt(i));
        }
        for(int i=idx+1;i<word.length();i++){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
    private int index(String word,char ch){
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                return i;
            }
        }
        return -1;
    }
}