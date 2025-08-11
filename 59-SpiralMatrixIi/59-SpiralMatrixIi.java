// Last updated: 12/08/2025, 00:20:58
class Solution {
    public int[][] generateMatrix(int n) {
        return matrix(n);
    }
    public static int[][] matrix(int n){
        int c=1;
        int minc=0;
        int minr=0;
        int maxc=n-1;
        int maxr=n-1;
        int[][] arr=new int[n][n];
        while(c<=n*n){
            for(int i=minc;i<=maxc;i++){
                arr[minr][i]=c;
                c++;
            }
            minr++;
            for(int i=minr;i<=maxr;i++){
                arr[i][maxc]=c;
                c++;
            }
            maxc--;
            for(int i=maxc;i>=minc;i--){
                arr[maxr][i]=c;
                c++;
            }
            maxr--;
            for(int i=maxr;i>=minr;i--){
                arr[i][minc]=c;
                c++;
            }
            minc++;
        }
        return arr;
    }
}