// Last updated: 12/08/2025, 00:13:14
class Solution {
    public int[][] findFarmland(int[][] land) {
        boolean[][] arr=new boolean[land.length][land[0].length];
        List<int[]> ans=new ArrayList<>();
        for(int row=0;row<land.length;row++){
            for(int col=0;col<land[0].length;col++){
                if(land[row][col]==1 && !arr[row][col]){
                    
                    int trow=row;
                    int tcol=col;

                    while(trow+1<land.length && land[trow+1][tcol]==1){
                        trow++;
                    }

                    while(tcol+1<land[0].length && land[trow][tcol+1]==1){
                        tcol++;
                    }
                    
                    for(int i=row;i<=trow;i++){
                        for(int j=col;j<=tcol;j++){
                            arr[i][j]=true;
                        }
                    }
                    ans.add(new int[]{row,col,trow,tcol});
                }
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}