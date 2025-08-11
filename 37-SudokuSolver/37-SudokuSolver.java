// Last updated: 12/08/2025, 00:21:25
class Solution {
    public void solveSudoku(char[][] board) {
        sudoku(board,0,0);
    }
    private static boolean sudoku(char[][] board,int row,int col){
        if(col==9){
            row++;
            col=0;
        }
        if(row==9){
            return true;
        }
        if(board[row][col]!='.'){
            return sudoku(board,row,col+1);
        }
        else {
            for(int val=1;val<=9;val++){
                if(isItSafe(board,row,col,val)){
                    board[row][col]=(char)(val+'0');
                    boolean ans=sudoku(board,row,col+1);
                    if(ans){
                        return true;
                    }
                    board[row][col]='.';
                }
            }
        }
        return false;
    }
    private static boolean isItSafe(char[][] board,int row,int col,int val){
        for(int i=0;i<9;i++){
            if(board[i][col]==(char)(val+'0')){
                return false;
            }
        }
        for (int i=0;i<9;i++){
            if(board[row][i]==(char)(val+'0')){
                return false;
            }
        }
        int cr=row-row%3;
        int cc=col-col%3;
        for (int i=cr;i<cr+3;i++){
            for (int j=cc;j<cc+3;j++){
                if(board[i][j]==(char)(val+'0')){
                    return false;
                }
            }
        }
        return true;
    }
}