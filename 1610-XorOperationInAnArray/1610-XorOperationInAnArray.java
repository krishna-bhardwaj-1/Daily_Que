// Last updated: 12/08/2025, 00:14:28
class Solution {
    public int xorOperation(int n, int start) {
        int xor = 0;
        int i=0;
        while (i!=n){
            xor=xor^start+2*i;
            i++;
        }
        return xor;
    }
}