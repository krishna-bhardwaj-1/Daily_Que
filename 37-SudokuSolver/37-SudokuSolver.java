// Last updated: 31/08/2025, 22:03:24
class Solution {
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
    private boolean helper(char[][] board,int row,int col){
        if(col==9){
            row++;
            col=0;
        }
        if(row==9){
            return true;
        }
        if(board[row][col]!='.'){
            return helper(board,row,col+1);
        }
        else{
            for(int val=1;val<=9;val++){
                if(isitsafe(board,row,col,(char)(val+'0'))){
                    board[row][col]=(char)(val+'0');
                    if(helper(board,row,col+1)) return true;
                    board[row][col]='.';
                }
            }
        }
        return false;
    }
    private boolean isitsafe(char[][] board,int row,int col,char val){
        //row
        for(int i=0;i<9;i++){
            if(board[row][i]==val){
                return false;
            }
        }
        //col
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