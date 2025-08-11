// Last updated: 12/08/2025, 00:14:30
class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            arr[i]=sum;
        }
        return arr;
    }
}