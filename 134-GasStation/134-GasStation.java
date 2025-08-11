// Last updated: 12/08/2025, 00:19:54
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        return cancomplete(gas,cost);
    }
    public static int cancomplete(int[] gas,int[] cost){
        int total=0;
        for(int i=0;i<cost.length;i++){
            total+=gas[i]-cost[i];
        }
        if(total<0){
            return -1;
        }
        int idx=0;
        int currfuel=0;
        for(int i=0;i<cost.length;i++){
            currfuel+=gas[i]-cost[i];
            if(currfuel<0){
                currfuel=0;
                idx=i+1;
            }
        }
        return idx;
    }
}