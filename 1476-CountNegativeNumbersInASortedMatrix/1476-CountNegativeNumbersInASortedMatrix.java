// Last updated: 12/08/2025, 00:14:57
class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        int cr=0;
        int cc=grid[0].length-1;
        while(cr<grid.length && cc>=0){
            if(grid[cr][cc]<0){
                c+=grid.length-cr;
                cc--;
            }
            else{
                cr++;
            }
        }
        return c;
    }
}