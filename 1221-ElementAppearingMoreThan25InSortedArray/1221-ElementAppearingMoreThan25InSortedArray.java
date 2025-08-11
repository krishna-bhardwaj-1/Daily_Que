// Last updated: 12/08/2025, 00:15:34
class Solution {
    public int findSpecialInteger(int[] arr) {
        int e=arr[0];
        int cnt=arr.length/4;
        int v=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==e){
                v++;
                if(v>cnt) return e;
            }
            else{
                e=arr[i];
                v=1;
            }
        }
        return e;
    }
}