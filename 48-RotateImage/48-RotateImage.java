// Last updated: 12/08/2025, 00:21:15
class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        rotat(matrix);
    }
    public static void transpose(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    public static void rotat(int[][] arr){
        for(int row=0;row<arr[0].length;row++){
            int i=0;
            int j=arr.length-1;
            while(i<j){
                int temp=arr[row][i];
                arr[row][i]=arr[row][j];
                arr[row][j]=temp;
                i++;
                j--;
            }
        }
    }
    public static void Print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}