// Last updated: 12/08/2025, 00:20:25
class Solution {
    public int numTrees(int n) {
        int[] dp=new int[n+1];
        dp[0]=dp[1]=1;
        //catalan number : 2n C n / n+1
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
}