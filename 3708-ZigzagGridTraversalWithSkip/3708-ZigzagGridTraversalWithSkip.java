// Last updated: 12/08/2025, 00:09:30
class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ll=new ArrayList<>();
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                //starting row +2
                for(int j=0;j<m;j++){
                    if(j%2==0){
                        ll.add(grid[i][j]);
                    }
                }
            }
            else{
                for(int j=m-1;j>=0;j--){
                    if(j%2!=0){
                        ll.add(grid[i][j]);
                    }
                }
            }
        }
        return ll;
    }
}