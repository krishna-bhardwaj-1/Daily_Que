// Last updated: 12/08/2025, 00:15:02
class Solution {
    public int removePalindromeSub(String s) {
        int n = s.length();
        if(n == 0){
            return 0;
        }
        if(palindrome(s)){
            return 1;
        }
        return 2;
    }
    private boolean palindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}