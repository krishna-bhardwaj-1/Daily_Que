// Last updated: 12/08/2025, 00:12:15
class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        while(n>1){
            for(int i=0;i<nums.length-1;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }
            nums[n-1]=0;
            n--;
        }
        return nums[0];
    }
}