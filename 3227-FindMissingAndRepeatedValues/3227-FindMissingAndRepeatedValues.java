// Last updated: 12/08/2025, 00:10:29
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] ans=new int[2];
        int[] arr=new int[(n*n)+1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                arr[grid[i][j]]++;
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==2){
                ans[0]=i;
            }
            else if(arr[i]==0){
                ans[1]=i;
            }
        }
        return ans;
    }
}