// Last updated: 27/08/2025, 10:57:13
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxdiag=Integer.MIN_VALUE;
        int area=0;
        for(int i=0;i<dimensions.length;i++){
            int diag=dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1];
            if(maxdiag<diag){
                maxdiag=diag;
                area=dimensions[i][0]*dimensions[i][1];
            }
            else if(maxdiag==diag){
                area=Math.max(area,dimensions[i][0]*dimensions[i][1]);
            }
        }
        return area;
    }
}