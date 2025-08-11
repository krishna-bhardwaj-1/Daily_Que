// Last updated: 12/08/2025, 00:18:16
class Solution {
    public int getSum(int a, int b) {
        if(b==0) return a;
        else return getSum(a^b,(a&b)<<1);
    }
}