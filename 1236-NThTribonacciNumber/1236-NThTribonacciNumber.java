// Last updated: 12/08/2025, 00:15:30
class Solution {
    public int tribonacci(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return(fibo(n,dp));
    }
    private int fibo(int n,int[] dp){
        //basecase
        if(n==0){
            return n;
        }
        if(n==1||n==2){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        //2 -> (1)
        // 0 1 1 2 4
        int c1=fibo(n-1,dp);
        int c2=fibo(n-2,dp);
        int c3=fibo(n-3,dp);
        int myans=c1+c2+c3;
        dp[n]=myans;
        return myans;
    }
}