// Last updated: 12/08/2025, 00:12:33
class Solution {
    public long mostPoints(int[][] questions) {
        long[] dp=new long[questions.length+1];
        Arrays.fill(dp,-1);
        return helper(questions,0,dp);
    }
    private static long helper(int[][] que,int i,long[] dp){
        if(i>=que.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        long inc=que[i][0]+helper(que,i+que[i][1]+1,dp);
        long exc=helper(que,i+1,dp);
        return dp[i]=Math.max(inc,exc);
    }
}