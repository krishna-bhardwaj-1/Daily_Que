// Last updated: 12/08/2025, 00:21:55
class Solution {
    public boolean isPalindrome(int x) {
        int sum=0, tar=x;
        if(tar<0) return false;
        while(x>0){
            int rem=x%10;
            x/=10;
            sum=sum*10+rem;
        }
        return sum==tar;
    }
}