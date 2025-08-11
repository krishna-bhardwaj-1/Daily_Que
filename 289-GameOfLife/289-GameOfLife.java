// Last updated: 12/08/2025, 00:18:35
class Solution {
    public void gameOfLife(int[][] board) {
        int[][] arr=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==1){
                    int zindapadosi=neighbour(i,j,board);
                    if(zindapadosi==2 || zindapadosi==3) arr[i][j]=board[i][j];
                    if(zindapadosi<2 || zindapadosi>3) arr[i][j]=0;
                }
                else{
                    int zindapadosi=neighbour(i,j,board);
                    if(zindapadosi==3) arr[i][j]=1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                board[i][j]=arr[i][j];
            }
        }
    }
    private int neighbour(int i,int j,int[][] arr){
        int zindapadosi=0;
        if(i>0){
            if(arr[i-1][j]==1) zindapadosi++;
        }
        if(i<arr.length-1){
            if(arr[i+1][j]==1) zindapadosi++;
        }

        if(j>0){
            if(arr[i][j-1]==1) zindapadosi++;
        }

        if(j<arr[0].length-1){
            if(arr[i][j+1]==1) zindapadosi++;
        }
        if((i-1)>=0 && (j+1)<arr[0].length){
            if(arr[i-1][j+1]==1) zindapadosi++;
        }
        if((i+1)<arr.length && (j+1)<arr[0].length){
            if(arr[i+1][j+1]==1) zindapadosi++;
        }
        if((i-1)>=0 && (j-1)>=0){
            if(arr[i-1][j-1]==1) zindapadosi++;
        }
        if((i+1)<arr.length && j>0){
            if(arr[i+1][j-1]==1) zindapadosi++;
        }
        return zindapadosi;
    }
}