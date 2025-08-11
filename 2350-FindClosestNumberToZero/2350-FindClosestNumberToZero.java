// Last updated: 12/08/2025, 00:12:13
class Solution {
    public int findClosestNumber(int[] nums) {
        int max=Integer.MAX_VALUE;
        int no=1;
        for(int i=0;i<nums.length;i++){
            int abs=Math.abs(0-nums[i]);
            if(max>abs ||(abs==max && abs>no)){
                max=Math.abs(0-nums[i]);
                no=nums[i];
            }
        }
        return no;
    }
}