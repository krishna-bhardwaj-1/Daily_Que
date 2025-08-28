// Last updated: 28/08/2025, 12:13:27
class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        int[][] arr=new int[n][n];
        for(int col=1;col<n;col++){
            int r=0;
            int c=col;
            List<Integer> ll=new ArrayList<>();
            while(r<n && c<n){
                ll.add(grid[r][c]);
                r++;
                c++;
            }
            Collections.sort(ll);
            r=0;
            c=col;
            while(r<n && c<n){
                arr[r][c]=ll.get(r);
                r++;
                c++;
            }
        }
        for(int row=0;row<n;row++){
            int r=row;
            int c=0;
            List<Integer> ll=new ArrayList<>();
            while(r<n && c<n){
                ll.add(grid[r][c]);
                r++;
                c++;
            }
            Collections.sort(ll,Collections.reverseOrder());
            r=row;
            c=0;
            while(r<n && c<n){
                arr[r][c]=ll.get(c);
                r++;
                c++;
            }
        }
        return arr;
    }
}