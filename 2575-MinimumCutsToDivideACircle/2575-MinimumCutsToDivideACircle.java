// Last updated: 12/08/2025, 00:11:31
class Solution {
    public int numberOfCuts(int n) {
        if(n==1) return 0;
        if(n%2==0){
            return n/2;
        }
        else{
            return n;
        }
    }
}