// Last updated: 12/08/2025, 00:14:49
class Solution {
    public int findLucky(int[] arr) {
        if(arr.length==0) return -1;
        int[] temp=new int[500];
        for(int i:arr){
            temp[i-1]++;
        }
        for(int i=499;i>=0;i--){
            if(temp[i]==i+1) return i+1;
        }
        return -1;
    }
}