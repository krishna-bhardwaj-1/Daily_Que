// Last updated: 12/08/2025, 00:18:57
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        long i=1l;
        while(i<n) i*=2;
        return i==n; 
    }
}