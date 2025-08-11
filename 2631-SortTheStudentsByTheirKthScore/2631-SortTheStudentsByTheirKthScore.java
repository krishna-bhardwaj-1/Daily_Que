// Last updated: 12/08/2025, 00:11:22
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        for(int i=0;i<score.length;i++){
            int idx=i;
            for(int j=i+1;j<score.length;j++){
                if(score[idx][k]<score[j][k]){
                    idx=j;
                }
            }
            swap(score,i,idx);
        }
        return score;
    }
    private static void swap(int[][] arr,int i,int idx){
        int in=0;
        while(in<arr[0].length){
            int temp=arr[i][in];
            arr[i][in]=arr[idx][in];
            arr[idx][in]=temp;
            in++;
        }
    }
}