// Last updated: 12/08/2025, 00:11:58
class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] ans=new int[grid.length-2][grid.length-2];
        for(int i=0;i<grid.length-2;i++){
            for(int j=0;j<grid.length-2;j++){
                ans[i][j]=max(grid,i,j);
            }
        }
        return ans;
    }
    private static int max(int[][] grid,int cr,int cc){
        int max=Integer.MIN_VALUE;
        for(int i=cr;i<cr+3;i++){
            for(int j=cc;j<cc+3;j++){
                max=Math.max(max,grid[i][j]);
            }
        }
        return max;
    }
}