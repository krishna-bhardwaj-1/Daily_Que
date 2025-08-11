// Last updated: 12/08/2025, 00:16:35
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int pro=0;
        for(int i:worker){
            int comp=0;
            for(int j=0;j<difficulty.length;j++){
                if(difficulty[j]<=i){
                    comp=Math.max(comp,profit[j]);
                }
            }
            pro+=comp;
        }
        return pro;
    }
}