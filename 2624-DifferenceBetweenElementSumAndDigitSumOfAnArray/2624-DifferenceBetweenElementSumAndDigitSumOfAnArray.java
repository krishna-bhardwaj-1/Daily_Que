// Last updated: 12/08/2025, 00:11:25
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int e:nums){
            sum+=e;
        }
        int digitsum=helper(nums);
        return sum-digitsum;
    }
    private static int helper(int[] nums){
        int digitsum=0;
        for(int n:nums){
            if(n<10){
                digitsum+=n;
            }
            else{
                while(n>0){
                    digitsum+=n%10;
                    n/=10;
                }
            }
        }
        return digitsum;
    }
}