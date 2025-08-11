// Last updated: 12/08/2025, 00:14:09
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb=new StringBuilder();
        for(String word:word1){
            sb.append(word);
        }

        StringBuilder sb1=new StringBuilder();
        for(String word:word2){
            sb1.append(word);
        }
        return sb.toString().equals(sb1.toString());
    }
}