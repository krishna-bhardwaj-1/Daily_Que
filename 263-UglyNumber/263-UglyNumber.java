// Last updated: 12/08/2025, 00:18:42
class Solution {
    public boolean isUgly(int n) {
        int i=2;
        while(i<=5&&n>0){
            if(n%i==0){
                n/=i;
            }
            else{
                i++;
            }
        }
        if(n==1) return true;
        return false;
    }
}