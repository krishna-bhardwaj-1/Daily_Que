// Last updated: 12/08/2025, 00:16:50
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int s1=helper(dp,cost,0,n);
        int s2=helper(dp,cost,1,n);
        return(Math.min(s1,s2));
    }
    private static int helper(int[] dp,int[] cost, int curr, int n){
        if(curr>=n){
            return 0;
        }
        if(curr==n-1){
            return cost[n-1];
        }

        if(dp[curr]!=-1){
            return dp[curr];
        }
        int c1=helper(dp,cost,curr+1,n);
        int c2=helper(dp,cost,curr+2,n);

        int futuremin=Math.min(c1,c2);
        int meraAns=cost[curr]+futuremin;
        dp[curr]=meraAns;
        return meraAns;
    }
}