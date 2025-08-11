// Last updated: 12/08/2025, 00:20:53
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp=new int[obstacleGrid.length+1][obstacleGrid[0].length+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return sol(0,0,obstacleGrid.length-1,obstacleGrid[0].length-1,obstacleGrid,dp);
    }
    public static int sol(int cr,int cc,int er,int ec,int[][] arr,int[][] dp){
        if(cr>er || cc>ec||arr[cr][cc]==1){
            return 0;
        }
        if(dp[cr][cc]!=-1){
            return dp[cr][cc];
        }
        if(cr==er && cc==ec){
            return 1;
        }
        int hc=sol(cr+1,cc,er,ec,arr,dp);
        int vc=sol(cr,cc+1,er,ec,arr,dp);
        dp[cr][cc]=hc+vc;
        return hc+vc;
    }
}