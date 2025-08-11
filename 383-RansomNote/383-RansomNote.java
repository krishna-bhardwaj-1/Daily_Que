// Last updated: 12/08/2025, 00:18:13
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] frequency=new int[26];
        for(int i=0;i<magazine.length();i++){
            frequency[magazine.charAt(i)-97]++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(frequency[ransomNote.charAt(i)-97]==0){
                return false;
            }
            frequency[ransomNote.charAt(i)-97]--;
        }
        return true;
    }
}