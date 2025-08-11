// Last updated: 12/08/2025, 00:09:09
class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        return Math.min(n*n,maxWeight/w);
    }
}