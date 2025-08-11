// Last updated: 12/08/2025, 00:17:09
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start=0;
        double maxsum=Integer.MIN_VALUE;
        double sum=0;
        int c=0;
        for(int i=0;i<nums.length;i++){ 
          sum += nums[i];
          if(i>=k-1){
            maxsum = Math.max(maxsum,sum/k);
            sum -= nums[start];
            start++;
          }
        }
        return maxsum;
    }
}