// Last updated: 12/08/2025, 00:16:27
class Solution {
    public int[][] transpose(int[][] arr) {
        int row=arr.length;
        int col=arr[0].length;
        int[][] transpose=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=arr[i][j];
            }
        }
        return transpose;
    }
}