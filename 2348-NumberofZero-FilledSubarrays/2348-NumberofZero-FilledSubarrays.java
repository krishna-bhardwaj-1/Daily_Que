// Last updated: 20/08/2025, 01:32:47
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long subary=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int a=i;
                while(i<nums.length && nums[i]==0) i++;
                long n=i-a;
                subary+=(n*(n+1))/2;
            }
        }
        return subary;
    }
}