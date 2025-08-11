// Last updated: 12/08/2025, 00:12:43
class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            if(palindromic(s)){
                return s;
            }
        }
        return "";
    }
    private boolean palindromic(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}