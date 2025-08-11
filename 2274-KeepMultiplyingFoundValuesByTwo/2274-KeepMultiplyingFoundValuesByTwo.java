// Last updated: 12/08/2025, 00:12:27
class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(present(nums,original)){
            original*=2;
        }
        return original;
    }
    private static boolean present(int[] nums,int target){
        for(int i:nums){
            if(i==target){
                return true;
            }
        }
        return false;
    }
}