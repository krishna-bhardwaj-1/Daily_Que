// Last updated: 12/08/2025, 00:13:52
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // int max=Integer.MIN_VALUE;
        // int min=Integer.MAX_VALUE;
        // int sum=0;
        // int sum2=0;
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        //     if(sum2+nums[i]<0){
        //         sum2+=nums[i];
        //     }
        //     min=Math.min(min,sum2);
        //     max=Math.max(max,sum);
        //     if(sum<0){
        //         sum=0;
        //     }
        //     if(sum2>0){
        //         sum=0;
        //     }
        // }
        // return Math.max(max,Math.abs(min));
        int minPrefixSum = 0, maxPrefixSum = 0;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            minPrefixSum = Math.min(minPrefixSum, prefixSum);
            maxPrefixSum = Math.max(maxPrefixSum, prefixSum);
        }

        return maxPrefixSum - minPrefixSum;
    }
}