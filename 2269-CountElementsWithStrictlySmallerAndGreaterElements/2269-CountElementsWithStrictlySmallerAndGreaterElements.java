// Last updated: 12/08/2025, 00:12:30
class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int st=nums[0];
        int gre=nums[nums.length-1];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>st && nums[i]<gre){
                count++;
            }
        }
        return count;
    }
}