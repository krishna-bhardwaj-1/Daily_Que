// Last updated: 12/08/2025, 00:15:56
class Solution {
    public int fib(int n) {
        int[] arr=new int[n+1];
        Arrays.fill(arr,-1);
        return helper(n,arr);
    }
    private int helper(int n,int[] dp){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int first=helper(n-1,dp);
        int second=helper(n-2,dp);

        return dp[n]=first+second;
    }
}