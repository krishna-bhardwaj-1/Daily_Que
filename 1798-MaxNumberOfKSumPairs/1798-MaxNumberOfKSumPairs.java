// Last updated: 12/08/2025, 00:14:05
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        int c=0;
        while(start<end){
            int sum=nums[start]+nums[end];
            if(sum==k){
                c++;
                start++;
                end--;
            }
            else if(sum<k){
                start++;
            }
            else{
                end--;
            }
        }
        return c;
    }
}