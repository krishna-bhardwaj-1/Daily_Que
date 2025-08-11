// Last updated: 12/08/2025, 00:09:58
class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[][] arr=new int[n][n];
        int num=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=num;
                num++;
            }
        }
        return(getno(arr,commands));
    }
    private int getno(int[][] arr,List<String> commands){
        int row=0;
        int col=0;
        for(int i=0;i<commands.size();i++){
            if(commands.get(i).equals("UP")){
                row--;
            }
            else if(commands.get(i).equals("DOWN")){
                row++;
            }
            else if(commands.get(i).equals("RIGHT")){
                col++;
            }
            else{
                col--;
            }
        }
        return arr[row][col];
    }
}