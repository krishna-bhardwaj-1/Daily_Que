// Last updated: 12/08/2025, 00:09:28
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if((i-k)<0){
                if(nums[i]>nums[i+k]){
                    sum+=nums[i];
                }
            }
            else if((i-k)>=0 && (i+k)<=nums.length-1){
                if(nums[i]>nums[i-k] && nums[i]>nums[i+k]){
                    sum+=nums[i];
                }
            }
            else{
                if(nums[i]>nums[i-k]){
                    sum+=nums[i];
                }
            }
        }
        return sum;
    }
}