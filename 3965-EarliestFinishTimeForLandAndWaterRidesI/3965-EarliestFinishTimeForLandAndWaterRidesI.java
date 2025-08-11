// Last updated: 12/08/2025, 00:08:56
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ride=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            for(int j=0;j<waterStartTime.length;j++){
            //land
                int land=landStartTime[i]+landDuration[i];
                int max=Math.max(land,waterStartTime[j]);
                int t1=max+waterDuration[j];
            //water
                int water=waterStartTime[j]+waterDuration[j];
                int max2=Math.max(water,landStartTime[i]);
                int t2=max2+landDuration[i];
                ride=Math.min(ride,Math.min(t1,t2));
            }
        }
        return ride;
    }
}