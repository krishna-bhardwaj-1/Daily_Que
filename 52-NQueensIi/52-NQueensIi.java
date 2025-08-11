// Last updated: 12/08/2025, 00:21:08
class Solution {
    static int count;
    public int totalNQueens(int n) {
        count=0;
        int[][] board=new int[n][n];
        queenconfig(board,0,n);
        return count;
    }
    private static void queenconfig(int[][] board,int cr,int n){
        if(cr==n){
            count++;
            return;
        }
        for(int cc=0;cc<n;cc++){
            if(kyamaiqueenrakhsktahu(board,cr,cc,n)){
                board[cr][cc]=1;
                queenconfig(board,cr+1,n);
                board[cr][cc]=0;
            }
        }
    }
    private static boolean kyamaiqueenrakhsktahu(int[][] board,int cr,int cc,int n){
        for(int row=0;row<=cr-1;row++){
            if(board[row][cc]==1){
                return false;
            }
        }
        int row=cr;
        int col=cc;
        while (row>=0 && col>=0){
            if(board[row][col]==1){
                return false;
            }
            row--;
            col--;
        }
        row=cr;
        col=cc;
        while (row>=0 && col<n){
            if(board[row][col]==1){
                return false;
            }
            row--;
            col++;
        }
        return true;
    }
}