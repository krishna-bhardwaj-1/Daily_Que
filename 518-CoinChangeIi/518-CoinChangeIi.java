// Last updated: 12/08/2025, 00:17:32
class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length+1][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return(sol(coins,coins.length,amount,dp));
    }
    private static int sol(int[] coins,int n,int amount,int[][] dp){
        int inc=0,exc=0;
        if(amount==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(dp[n][amount]!=-1){
            return dp[n][amount];
        }
        if(coins[n-1]<=amount){
            inc=sol(coins,n,amount-coins[n-1],dp);
        }
        exc=sol(coins,n-1,amount,dp);
        dp[n][amount]=inc+exc;
        return inc+exc;
    }
}