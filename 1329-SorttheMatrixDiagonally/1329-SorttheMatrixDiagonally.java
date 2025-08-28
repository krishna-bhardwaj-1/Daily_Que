// Last updated: 28/08/2025, 15:09:41
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] arr=new int[n][m];
        for(int col=1;col<m;col++){
            int r=0;
            int c=col;
            List<Integer> ll=new ArrayList<>();
            while(r<n && c<m){
                ll.add(mat[r][c]);
                r++;
                c++;
            }
            Collections.sort(ll);
            r=0;
            c=col;
            while(r<n && c<m){
                arr[r][c]=ll.get(r);
                r++;
                c++;
            }
        }
        for(int row=0;row<n;row++){
            int r=row;
            int c=0;
            List<Integer> ll=new ArrayList<>();
            while(r<n && c<m){
                ll.add(mat[r][c]);
                r++;
                c++;
            }
            Collections.sort(ll);
            r=row;
            c=0;
            while(r<n && c<m){
                arr[r][c]=ll.get(c);
                r++;
                c++;
            }
        }
        return arr;
    }
}