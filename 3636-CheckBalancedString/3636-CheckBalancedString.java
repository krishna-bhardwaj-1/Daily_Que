// Last updated: 12/08/2025, 00:09:42
class Solution {
    public boolean isBalanced(String num) {
        int sumeven=0;
        for(int i=0;i<num.length();i+=2){
            sumeven+=num.charAt(i)-'0';
        }
        int sumodd=0;
        for(int i=1;i<num.length();i+=2){
            sumodd+=num.charAt(i)-'0';
        }
        return(sumeven==sumodd);
    }
}