// Last updated: 12/08/2025, 00:11:35
class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        Set<Double> set=new HashSet<>();
        while(i<=j){
            set.add((nums[i]+nums[j])/2.0);
            i++;
            j--;
        }
        return set.size();
    }
}