// Last updated: 12/08/2025, 00:11:33
class Solution {
    public int unequalTriplets(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                if(nums[i]!=nums[j]){
                    for(int k=j+1;k<nums.length;k++){
                        if((nums[j]!=nums[k]) &&(nums[i]!=nums[k])) c++;
                    }
                }
            }
        }
        return c;
    }
}