package DailyQue;

import java.util.Scanner;

public class Count_Servers_that_Communicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] grid=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                grid[i][j]=sc.nextInt();
            }
        }

        int server=0;
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                if(grid[row][col]==1){
                    if(rowise(row,col,grid)||colwise(row,col,grid)) server++;
                }
            }
        }
        System.out.println(server);
    }
    public static boolean rowise(int row,int col,int[][] grid){
        for(int i=0;i<col;i++){
            if(grid[row][i]==1) return true;
        }
        for(int i=col+1;i<grid[0].length;i++){
            if(grid[row][i]==1){
                return true;
            }
        }
        return false;
    }

    public static boolean colwise(int row,int col,int[][] grid){
        for(int i=0;i<row;i++){
            if(grid[i][col]==1) return true;
        }

        for(int i=row+1;i<grid.length;i++){
            if(grid[i][col]==1){
                return true;
            }
        }
        return false;
    }
}
