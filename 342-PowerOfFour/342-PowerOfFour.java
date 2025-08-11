// Last updated: 12/08/2025, 00:18:26
class Solution {
    public boolean isPowerOfFour(int n) {
        long i=1;
        while(i<n){
            i*=4;
        }
        return i==n;
    }
}