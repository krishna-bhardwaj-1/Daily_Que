// Last updated: 12/08/2025, 00:16:12
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int linearsum=kadens(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]*=-1;
        }
        int mid=kadens(nums);
        sum+=mid;
        if(sum==0){
            return linearsum;
        }
        return Math.max(linearsum,sum);
    }
    public static int kadens(int[] arr){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}