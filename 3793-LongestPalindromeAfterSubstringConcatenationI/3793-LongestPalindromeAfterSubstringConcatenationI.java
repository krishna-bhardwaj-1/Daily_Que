// Last updated: 12/08/2025, 00:09:15
class Solution {
    public int longestPalindrome(String s, String t) {
        int max=0;
        for(int i=0;i<=s.length();i++){
            for(int j=i;j<=s.length();j++){
                String sb=s.substring(i,j);
                
                for(int a=0;a<=t.length();a++){
                    for(int b=a;b<=t.length();b++){
                        String sb2=t.substring(a,b);
                        
                        String c1=sb+sb2;
                        if(palindrome(c1)) max=Math.max(max,c1.length());
                    }
                }
            }
        }
        return max;
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