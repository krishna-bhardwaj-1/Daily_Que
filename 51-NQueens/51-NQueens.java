// Last updated: 12/08/2025, 00:21:09
class Solution {
    static List<List<String>> ans;
    public List<List<String>> solveNQueens(int n) {
        String[][] board=new String[n][n];
        ans=new ArrayList<>();
        for (String[] row:board){
            Arrays.fill(row,".");
        }
        queenconfig(0,n,board);
        return ans;
    }
    private static void queenconfig(int cr,int n,String[][] board){
        if(cr==n){
            List<String> ll=new ArrayList<>();
            for (int i=0;i<n;i++){
                StringBuilder sb=new StringBuilder();
                for (int j=0;j<n;j++){
                    sb.append(board[i][j]);
                }
                ll.add(sb.toString());
            }
            ans.add(ll);
            return;
        }

        for (int cc=0;cc<n;cc++){
            if(kyamainqueenrakhsktahu(board,cr,cc)){
                board[cr][cc]="Q";
                queenconfig(cr+1,n,board);
                board[cr][cc]=".";
            }
        }
    }
    private static boolean kyamainqueenrakhsktahu(String[][] board,int cr,int cc){
        for (int row=0;row<cr;row++){
            if(board[row][cc]=="Q"){
                return false;
            }
        }
        int row=cr;
        int col=cc;
        while (row>=0 && col>=0){
            if(board[row][col]=="Q"){
                return false;
            }
            row--;
            col--;
        }
        row=cr;
        col=cc;
        while (row>=0 && col<board[0].length){
            if(board[row][col]=="Q"){
                return false;
            }
            row--;
            col++;
        }
        return true;
    }
}