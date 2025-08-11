// Last updated: 12/08/2025, 00:09:07
class Solution {
    public int[] minCosts(int[] cost) {
        int min=Integer.MAX_VALUE;
        int i=0;
        while(i<cost.length){
            cost[i]=Math.min(min,cost[i]);
            min=cost[i];
            i++;
        }
        return cost;
    }
}