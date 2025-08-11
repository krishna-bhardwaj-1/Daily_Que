// Last updated: 12/08/2025, 00:11:48
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            int num=n;
            StringBuilder sb=new StringBuilder();
            while(num>0){
                sb.append(num%i);
                num/=i;
            }
            if(!ispalindrome(sb.toString())){
                return false;
            }
        }
        return true;
    }
    private static boolean ispalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}