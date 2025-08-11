// Last updated: 12/08/2025, 00:20:36
class Solution {
    public boolean search(int[] nums, int target) {
        int lo=0;
        int hi= nums.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]==target) return true;
            if(nums[lo]==nums[mid]&&nums[mid]==nums[hi]){
                lo++;
                hi--;
            }
            else if (nums[lo]<=nums[mid]) {
                if(nums[lo]<=target&&nums[mid]>=target) hi=mid-1;
                else lo=mid+1;
            }
            else{
                if(nums[mid]<=target&&nums[hi]>=target) lo=mid+1;
                else hi=mid-1;
            }
        }
        return false;
    }
}