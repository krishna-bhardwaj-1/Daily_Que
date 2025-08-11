// Last updated: 12/08/2025, 00:17:02
class Solution {
    public boolean validPalindrome(String s) {
        if(ispalindrome(s)) return true;
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return ispalindrome(s.substring(i,j))||ispalindrome(s.substring(i+1,j+1));
            }
            i++;
            j--;
        }
        return true;
    }
    private static boolean ispalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}