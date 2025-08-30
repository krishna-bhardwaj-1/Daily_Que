// Last updated: 31/08/2025, 01:03:17
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if (board[i][j] != '.') {
                    char val = board[i][j];
                    board[i][j] = '.';
                    if (!isitsafe(board, i, j, val)) {
                        return false;
                    }
                    board[i][j] = val;
                }
            }
        }
        return true;
    }
    private boolean isitsafe(char[][] board,int row,int col,char val){
        for(int i=0;i<9;i++){
            if(board[row][i]==val){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(board[i][col]==val){
                return false;
            }
        }
        row=row-row%3;
        col=col-col%3;
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                if(board[i][j]==val){
                    return false;
                }
            }
        }
        return true;
    }
}