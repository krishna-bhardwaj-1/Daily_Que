// Last updated: 12/08/2025, 00:20:54
class Solution {
    static int path;
    public int uniquePaths(int m, int n) {
        path=0;
        int[][] dp = new int[m+1][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return(countpath(0,0,m-1,n-1,dp));
    }
    private int countpath(int cr,int cc,int er,int ec,int[][] dp){
        if(cr>er||cc>ec){
            return 0;
        }
        if(dp[cr][cc]!=-1){
            return dp[cr][cc];
        }
        if(cr==er && cc==ec){
            return 1;
        }
        int hc=countpath(cr,cc+1,er,ec,dp);
        int vc=countpath(cr+1,cc,er,ec,dp);
        dp[cr][cc]=hc+vc;
        return hc+vc;
    }
}