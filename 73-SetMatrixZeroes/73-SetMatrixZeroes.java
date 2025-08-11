// Last updated: 12/08/2025, 00:20:43
class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row=new HashSet<>();
        Set<Integer> col=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i:row){
            set(matrix,i);
        }

        for(int i:col){
            sett(matrix,i);
        }
    }

    private void set(int[][] mat,int row){
        for(int i=0;i<mat[0].length;i++){
            mat[row][i]=0;
        }
    }

    private void sett(int[][] mat,int col){
        for(int i=0;i<mat.length;i++){
            mat[i][col]=0;
        }
    }
}