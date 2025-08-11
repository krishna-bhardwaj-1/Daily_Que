// Last updated: 12/08/2025, 00:10:37
class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long max=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    max=Math.max(max,(nums[i]-nums[j])*(long)nums[k]);
                }
            }
        }
        return max;
    }
}