// Last updated: 12/08/2025, 00:13:15
class Solution {
    public int findMiddleIndex(int[] nums) {
        return(sum(nums,0));
    }
    private int sum(int[] arr,int idx){
        for(idx=0;idx<arr.length;idx++){
            int stsum=0;
            for(int i=0;i<idx;i++){
                stsum+=arr[i];
            }
            int lstsum=0;
            for(int i=idx+1;i<arr.length;i++){
                lstsum+=arr[i];
            }
            if(stsum==lstsum){
                return idx;
            }
        }
        return -1;
    }
}