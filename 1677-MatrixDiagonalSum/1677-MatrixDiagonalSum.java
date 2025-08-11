// Last updated: 12/08/2025, 00:14:16
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1=0;
        int sr=0,sc=0;
        while(sr<mat.length && sc<mat[0].length){
            sum1+=mat[sr][sc];
            sr++;
            sc++;
        }
        int sum2=0;
        int cr=0,cc=mat[0].length-1;
        while(cr<mat.length && cc>=0){
            sum2+=mat[cr][cc];
            cr++;
            cc--;
        }
        if(mat.length%2!=0){
            int sub=mat[mat.length/2][mat[0].length/2];
            return sum1+sum2-sub;
        }
        return sum2+sum1;
    }
}