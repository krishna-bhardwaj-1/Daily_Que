// Last updated: 12/08/2025, 00:14:54
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ll=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(islucky(matrix,i,j)){
                    ll.add(matrix[i][j]);
                }
            }
        }
        return ll;
    }

    public static boolean islucky(int[][] matrix,int cr,int cc){
        for(int i=0;i<matrix[cr].length;i++){
            if(matrix[cr][i]<matrix[cr][cc]){
                return false;
            }
        }
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][cc]>matrix[cr][cc]){
                return false;
            }
        }
        return true;
    }
}