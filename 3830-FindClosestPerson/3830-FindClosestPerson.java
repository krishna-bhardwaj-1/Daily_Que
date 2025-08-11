// Last updated: 12/08/2025, 00:09:08
class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(x-z)<Math.abs(z-y)) return 1;
        if(Math.abs(x-z)>Math.abs(z-y)) return 2;
        // if(Math.abs(x-z)>Math.abs(z-y)) return 0;
        return 0;
    }
}