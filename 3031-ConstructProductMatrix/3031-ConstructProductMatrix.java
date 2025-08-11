// Last updated: 12/08/2025, 00:10:43
class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] left=new int[n][m];
        int prod=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                left[i][j]=prod;
                prod=(prod%12345)*(grid[i][j]%12345)%12345;
            }
        }
        prod=1;
        int[][] right=new int[n][m];
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                right[i][j]=prod;
                prod=(prod%12345)*(grid[i][j]%12345)%12345;
            }
        }

        int[][] ans=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=left[i][j]*right[i][j]%12345;
            }
        }
        return ans;
    }
}