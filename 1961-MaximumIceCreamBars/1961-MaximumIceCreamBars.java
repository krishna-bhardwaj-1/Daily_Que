// Last updated: 12/08/2025, 00:13:32
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c=0;
        for(int i=0;i<costs.length;i++){
            if(costs[i]<=coins){
                c++;
                coins-=costs[i];
            }
            else{
                break;
            }
        }
        return c;
    }
}