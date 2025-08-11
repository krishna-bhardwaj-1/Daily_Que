// Last updated: 12/08/2025, 00:15:33
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] arry=new int[100];
        for(int[] arr:dominoes){
            if(arr[0]<arr[1]){
                arry[(arr[0]*10)+arr[1]]++;
            }
            else{
                arry[(arr[1]*10)+arr[0]]++;
            }
        }
        int c=0;
        for(int i:arry){
            if(i>=2){
                c+=(i*(i-1))/2;
            }
        }
        return c;
    }
}