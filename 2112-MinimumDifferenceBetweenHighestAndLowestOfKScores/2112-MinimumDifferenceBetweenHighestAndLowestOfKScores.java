// Last updated: 12/08/2025, 00:13:10
class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(k==1){
            return 0;
        }
        else{
            int min=Integer.MAX_VALUE;
            int i=0;
            int j=k-1;
            while(j<nums.length){
                min=Math.min(min,nums[j]-nums[i]);
                i++;
                j++;
            }
            return min;
        }
            
    }
}