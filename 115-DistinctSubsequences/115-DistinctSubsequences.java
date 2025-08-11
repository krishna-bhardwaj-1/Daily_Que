// Last updated: 12/08/2025, 00:20:08
class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp=new int[s.length()+1][t.length()+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return(sol(s,t,s.length(),t.length(),dp));
    }
    private int sol(String s,String target,int n,int m,int[][] dp){
        int inc=0,exc=0;
        if(m==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(s.charAt(n-1)==target.charAt(m-1)){
            inc=sol(s,target,n-1,m-1,dp);
        }
        exc=sol(s,target,n-1,m,dp);
        dp[n][m]=inc+exc;
        return inc+exc;
    }
}