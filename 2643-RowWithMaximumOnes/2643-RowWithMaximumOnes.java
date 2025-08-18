// Last updated: 19/08/2025, 00:46:23
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row=0;
        int one=0;
        for(int j=0;j<mat[0].length;j++){
            if(mat[0][j]==1) one++;
        }

        for(int i=1;i<mat.length;i++){
            int ron=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) ron++;
            }
            if(one<ron){
                row=i;
                one=ron;
            }
        }

        return new int[]{row,one};
    }
}