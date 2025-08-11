// Last updated: 12/08/2025, 00:11:18
class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long pair=0;
        for(int i=0;i<nums.length-1;++i){
            int lb=lb(nums,i+1,lower-nums[i]);
            int ub=ub(nums,i+1,upper-nums[i]);
            pair+=(ub-lb);
        }
        return pair;
    }
    public static int lb(int[] nums,int lo,int target){
        int hi=nums.length;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid;
            }
        }
        return lo;
    }
    public static int ub(int[] nums,int lo,int target){
        int hi=nums.length;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]<=target){
                lo=mid+1;
            }
            else{
                hi=mid;
            }
        }
        return lo;
    }
}