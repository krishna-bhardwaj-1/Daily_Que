// Last updated: 12/08/2025, 00:21:57
class Solution {
    public String longestPalindrome(String s) {
        int max=-1;
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String ns=s.substring(i,j);
                if(max<ns.length() && palindrome(ns)){
                    max=ns.length();
                    ans=ns;
                }
            }
        }
        return ans;
    }
    private static boolean palindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}