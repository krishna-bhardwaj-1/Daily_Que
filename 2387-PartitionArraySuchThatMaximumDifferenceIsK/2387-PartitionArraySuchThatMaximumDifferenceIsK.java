// Last updated: 12/08/2025, 00:12:08
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=0;
        int c=1;
        int min=nums[0];
        while(j<nums.length){
            if((nums[j]-min)<=k){
                j++;
            }
            else{
                c++;
                min=nums[j];
                i=j;
            }
        }
        return c;
    }
}