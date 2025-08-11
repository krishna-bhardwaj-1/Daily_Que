// Last updated: 12/08/2025, 00:18:31
class Solution {
    public boolean isPowerOfThree(int n) {
        long i=1;
        while(i<n){
            i*=3;
        }
        return i==n;
    }
}