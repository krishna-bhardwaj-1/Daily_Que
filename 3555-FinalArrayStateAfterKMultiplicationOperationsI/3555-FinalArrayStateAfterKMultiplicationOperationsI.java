// Last updated: 12/08/2025, 00:09:55
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k-->0){
            nums[min(nums)]*=multiplier;
        }
        return nums;
    }
    private static int min(int[] arr){
        int idx=0;
        int no=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<no){
                no=arr[i];
                idx=i;
            }
        }
        return idx;
    }
}