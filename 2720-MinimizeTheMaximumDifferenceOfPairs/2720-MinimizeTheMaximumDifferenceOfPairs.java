// Last updated: 12/08/2025, 00:11:12
class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int lo=0;
        int hi=nums[nums.length-1]-nums[0];
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isitpossible(nums,mid,p)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }

    private boolean isitpossible(int[] nums,int mid,int p){
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(Math.abs(nums[i]-nums[i-1])<=mid){
                c++;
                i++;
            }
        }
        return c>=p;
    }
}