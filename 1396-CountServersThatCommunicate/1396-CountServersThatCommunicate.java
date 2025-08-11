// Last updated: 12/08/2025, 00:15:15
class Solution {
    public int countServers(int[][] grid) {
        int server=0;
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                if(grid[row][col]==1){
                    if(rowise(row,col,grid)||colwise(row,col,grid)) server++;
                }
            }
        }
        return server;
    }

    public boolean rowise(int row,int col,int[][] grid){
        for(int i=0;i<col;i++){
            if(grid[row][i]==1) return true;
        }
        for(int i=col+1;i<grid[0].length;i++){
            if(grid[row][i]==1){
                return true;
            }
        }
        return false;
    }

    public boolean colwise(int row,int col,int[][] grid){
        for(int i=0;i<row;i++){
            if(grid[i][col]==1) return true;
        }

        for(int i=row+1;i<grid.length;i++){
            if(grid[i][col]==1){
                return true;
            }
        }
        return false;
    }
}