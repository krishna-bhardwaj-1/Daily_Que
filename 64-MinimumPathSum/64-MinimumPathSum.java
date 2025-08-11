// Last updated: 12/08/2025, 00:20:51
class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length+1][grid[0].length+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return(sol(grid,0,0,grid.length-1,grid[0].length-1,dp));
    }
    private int sol(int[][] grid,int cr,int cc,int er,int ec,int[][] dp){
        if(cr>er||cc>ec){
            return Integer.MAX_VALUE;
        }
        if(dp[cr][cc]!=-1){
            return dp[cr][cc];
        }
        if(cr==er&&cc==ec){
            return grid[er][ec];
        }
        int c1=sol(grid,cr,cc+1,er,ec,dp);
        int c2=sol(grid,cr+1,cc,er,ec,dp);
        int minans=Math.min(c1,c2);
        return dp[cr][cc]=grid[cr][cc]+minans;
    }
}