// Last updated: 12/08/2025, 00:17:48
class Solution {
    public int islandPerimeter(int[][] grid) {
        int per=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    per+=4;
                    if(j+1<grid[0].length && grid[i][j+1]==1) per--;
                    if(j-1>=0 && grid[i][j-1]==1) per--;
                    if(i+1<grid.length && grid[i+1][j]==1) per--;
                    if(i-1>=0 && grid[i-1][j]==1) per--; 
                }
            }
        }
        return per;
    }
}