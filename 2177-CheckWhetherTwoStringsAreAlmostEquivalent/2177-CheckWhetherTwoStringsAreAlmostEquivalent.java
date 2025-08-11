// Last updated: 12/08/2025, 00:12:58
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq=new int[26];
        for(char ch:word1.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:word2.toCharArray()){
            freq[ch-'a']--;
        }
        for(int i:freq){
            if(i>3||i<-3){
                return false;
            }
        }
        return true;
    }
}